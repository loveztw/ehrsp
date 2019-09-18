package cn.comelo.controller;

import cn.comelo.annotation.PassToken;
import cn.comelo.common.ResponseCode;
import cn.comelo.ehrsp.service.SmsVerifyCodeService;
import cn.comelo.ehrsp.service.UserService;
import cn.comelo.exception.MyException;
import cn.comelo.other.service.SmsService;
import cn.comelo.pojo.CmlSmsVerifyCode;
import cn.comelo.pojo.CmlUser;
import cn.comelo.response.SendSmsResponseData;
import cn.comelo.utils.CheckUtils;
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

    @ApiOperation("发送校验码")
    @PostMapping("/send-verify-code")
    @PassToken
    public JsonResponse sendVerifyCode(String telNumber) {

        //电话号码格式校验
        boolean ret = CheckUtils.checkTelNumber(telNumber);
        if (ret == false) {
            SendSmsResponseData sendSmsResponseData = new SendSmsResponseData();
            sendSmsResponseData.setCode(ResponseCode.RES_INVALID_TELNUM);
            sendSmsResponseData.setDetail("Invalid tel-number.");
            return JsonResponse.errorMap(sendSmsResponseData);
        }

//        CmlUser cmlUser = userService.findUserByTel(telNumber);
//        if (cmlUser != null) {
//            SendSmsResponseData sendSmsResponseData = new SendSmsResponseData();
//            sendSmsResponseData.setCode(ResponseCode.RES_TELNUM_EXIST);
//            sendSmsResponseData.setDetail("The tel-number has already exist.");
//            return JsonResponse.errorMap(sendSmsResponseData);
//        }

        String verifyCode = null;
        try {
            verifyCode = smsService.sendVerifyCode(telNumber);
        } catch (MyException e) {
            SendSmsResponseData sendSmsResponseData = new SendSmsResponseData();
            sendSmsResponseData.setCode(e.getCode());
            sendSmsResponseData.setDetail("Failed to send verify code.");
            return JsonResponse.errorMap(sendSmsResponseData);
        }

        CmlSmsVerifyCode cmlSmsVerifyCode = new CmlSmsVerifyCode();
        cmlSmsVerifyCode.setMobile(telNumber);
        cmlSmsVerifyCode.setVerifyCode(verifyCode);
        smsVerifyCodeService.insertVerifyCode(cmlSmsVerifyCode);
        return JsonResponse.ok();
    }
}
