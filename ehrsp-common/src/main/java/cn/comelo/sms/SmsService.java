package cn.comelo.sms;

public interface SmsService {

    //短信服务初期化
    public void init();

    //发送验证码
    public String sendVerifyCode(String tel);
}
