package cn.comelo.controller;

import cn.comelo.annotation.PassToken;
import cn.comelo.common.ResponseCode;
import cn.comelo.ehrsp.service.SmsVerifyCodeService;
import cn.comelo.ehrsp.service.UserService;
import cn.comelo.other.service.TokenService;
import cn.comelo.pojo.CmlUser;
import cn.comelo.response.BaseResponseData;
import cn.comelo.response.UserResponseData;
import cn.comelo.utils.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.n3r.idworker.Sid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;
import java.util.UUID;

@Api("用户操作相关API")
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private Sid sid;

    @Autowired
    private UserService userService;

    @Autowired
    private SmsVerifyCodeService smsVerifyCodeService;

    @Autowired
    private TokenService tokenService;

    private final String usernamePrefix = "co";

    /** 生成User id */
    private String genUserid() {
        return sid.nextShort();
    }

    /** 生成随机用户名 */
    private String genRandomUsername() {
        return usernamePrefix + UUID.randomUUID().toString();
    }

    @ApiOperation("电话号码注册")
    @PostMapping("/register-mobile")
    @PassToken
    public JsonResponse registerMobile(String verifyCode, @RequestBody CmlUser cmlUser) {

        if (StringUtils.isEmpty(verifyCode)) {
            BaseResponseData baseResponseData = new BaseResponseData();
            baseResponseData.setCode(ResponseCode.RES_INVALID_VERIFYCODE);
            baseResponseData.setDetail("Invalid verify code.");
            return JsonResponse.errorMap(baseResponseData);
        }

        String mobile = cmlUser.getMobile();
        //String mail = cmlUser.getMail();
        String password = cmlUser.getPassword();
        String username = cmlUser.getUsername();

        if (StringUtils.isEmpty(mobile) || StringUtils.isEmpty(password)) {
            BaseResponseData baseResponseData = new BaseResponseData();
            baseResponseData.setCode(ResponseCode.RES_INVALID_REGINFO);
            baseResponseData.setDetail("Invalid register information.");
            return JsonResponse.errorMap(baseResponseData);
        }

        CmlUser cmlUserDb = userService.findUserByTel(mobile);
        if (cmlUserDb != null) {
            BaseResponseData baseResponseData = new BaseResponseData();
            baseResponseData.setCode(ResponseCode.RES_MOBILE_EXIST);
            baseResponseData.setDetail("Mobile is already registered.");
            return JsonResponse.errorMap(baseResponseData);
        }

        if (!smsVerifyCodeService.isVerifyCodeValid(mobile, verifyCode)) {
            /* verify code is not valid */
            BaseResponseData baseResponseData = new BaseResponseData();
            baseResponseData.setCode(ResponseCode.RES_INVALID_VERIFYCODE);
            baseResponseData.setDetail("Invalid verify code.");
            return JsonResponse.errorMap(baseResponseData);
        }

        cmlUser.setUserid(genUserid());

        if (StringUtils.isEmpty(username)) {
            username = genRandomUsername();
            cmlUser.setUsername(username);
        }

        Date curDate = new Date();
        cmlUser.setCreateTime(curDate);
        cmlUser.setUpdateTime(curDate);
        cmlUser.setMailAuth(0);
        userService.insertUser(cmlUser);

        return JsonResponse.ok();
    }

    @ApiOperation("手机验证码登录")
    @PostMapping("/login-vcode")
    @PassToken
    public JsonResponse loginByVerifyCode(String mobile, String verifyCode) {

        if (StringUtils.isEmpty(mobile) || StringUtils.isEmpty(verifyCode)) {
            BaseResponseData baseResponseData = new BaseResponseData();
            baseResponseData.setCode(ResponseCode.RES_INVALID_LOGININFO);
            baseResponseData.setDetail("Invalid login information.");
            return JsonResponse.errorMap(baseResponseData);
        }

        CmlUser cmlUserDb = userService.findUserByTel(mobile);
        if (cmlUserDb == null) {
            BaseResponseData baseResponseData = new BaseResponseData();
            baseResponseData.setCode(ResponseCode.RES_MOBILE_NOTEXIST);
            baseResponseData.setDetail("Mobile is not registered.");
            return JsonResponse.errorMap(baseResponseData);
        }

        if (!smsVerifyCodeService.isVerifyCodeValid(mobile, verifyCode)) {
            /* verify code is not valid */
            BaseResponseData baseResponseData = new BaseResponseData();
            baseResponseData.setCode(ResponseCode.RES_INVALID_VERIFYCODE);
            baseResponseData.setDetail("Invalid verify code.");
            return JsonResponse.errorMap(baseResponseData);
        }

        //Get Token
        String token = tokenService.getToken(cmlUserDb);
        UserResponseData userResponseData = new UserResponseData();
        userResponseData.setToken(token);
        userResponseData.setUserName(cmlUserDb.getUsername());
        return JsonResponse.ok(userResponseData);
    }

}
