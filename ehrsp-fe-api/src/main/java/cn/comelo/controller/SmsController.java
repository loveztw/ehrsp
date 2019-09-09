package cn.comelo.controller;

import cn.comelo.ehrsp.service.SmsVerifyCodeService;
import cn.comelo.ehrsp.service.UserService;
import cn.comelo.exception.MyException;
import cn.comelo.other.service.SmsService;
import cn.comelo.pojo.CmlSmsVerifyCode;
import cn.comelo.pojo.CmlUser;
import cn.comelo.response.SendSmsResponseData;
import cn.comelo.utils.JsonResponse;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Api("短信操作相关API")
@RestController
@RequestMapping("/sms")
public class SmsController {

    @Autowired
    private SmsService smsService;

    @Autowired
    private UserService userService;

    @Autowired
    private SmsVerifyCodeService smsVerifyCodeService;

    @ApiOperation("用户注册")
    @ApiImplicitParam(name = "telNumber", value = "用户电话号码", dataType = "String")
    @PostMapping("/send-verify-code")
    public JsonResponse sendVerifyCode(String telNumber) {

        CmlUser cmlUser = userService.findUserByTel(telNumber);
        if (cmlUser != null) {
            return JsonResponse.errorMsg("The tel-number has already exist.");
        }

        String verifyCode = null;
        try {
            verifyCode = smsService.sendVerifyCode(telNumber);
        } catch (MyException e) {
            //return JsonResponse.errorMsg("Failed to send verify code.");
            SendSmsResponseData sendSmsResponseData = new SendSmsResponseData();
            sendSmsResponseData.setCode(e.getCode());
            return JsonResponse.errorMap(sendSmsResponseData);
        }

        CmlSmsVerifyCode cmlSmsVerifyCode = new CmlSmsVerifyCode();
        cmlSmsVerifyCode.setMobile(telNumber);
        cmlSmsVerifyCode.setVerifyCode(verifyCode);
        smsVerifyCodeService.insertVerifyCode(cmlSmsVerifyCode);
        return JsonResponse.ok();
    }
}
