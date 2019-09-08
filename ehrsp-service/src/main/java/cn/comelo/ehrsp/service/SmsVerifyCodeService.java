package cn.comelo.ehrsp.service;

import cn.comelo.pojo.CmlSmsVerifyCode;

public interface SmsVerifyCodeService {

    /** 给用户发送的验证码插入到数据库 */
    public void insertVerifyCode(CmlSmsVerifyCode cmlSmsVerifyCode);
}
