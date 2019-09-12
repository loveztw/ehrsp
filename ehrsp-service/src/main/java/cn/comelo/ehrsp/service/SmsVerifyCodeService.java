package cn.comelo.ehrsp.service;

import cn.comelo.pojo.CmlSmsVerifyCode;

public interface SmsVerifyCodeService {

    /** 给用户发送的验证码插入到数据库 */
    public void insertVerifyCode(CmlSmsVerifyCode cmlSmsVerifyCode);

    /** 验证码是否在有效期 */
    public int isVerifyCodeValid(String mobile, String verifyCode);
}
