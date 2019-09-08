package cn.comelo.other.service;

import cn.comelo.exception.MyException;

public interface SmsService {

    //初始化
    public void init();

    //发送验证码
    public String sendVerifyCode(String tel) throws MyException;
}
