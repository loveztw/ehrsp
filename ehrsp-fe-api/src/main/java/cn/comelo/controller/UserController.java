package cn.comelo.controller;

import cn.comelo.common.ResponseCode;
import cn.comelo.ehrsp.service.SmsVerifyCodeService;
import cn.comelo.ehrsp.service.UserService;
import cn.comelo.pojo.CmlUser;
import cn.comelo.response.BaseResponseData;
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
    @ApiImplicitParam(name = "User", value = "用户注册数据", dataType = "CmlUser")
    @PostMapping("/register-mobile")
    public JsonResponse sendVerifyCode(String verifyCode, @RequestBody CmlUser cmlUser) {

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

        int count = smsVerifyCodeService.isVerifyCodeValid(mobile, verifyCode);
        if (count == 0) {
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

}
