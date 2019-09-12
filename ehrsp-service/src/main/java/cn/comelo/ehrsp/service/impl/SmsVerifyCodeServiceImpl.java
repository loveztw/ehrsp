package cn.comelo.ehrsp.service.impl;

import cn.comelo.ehrsp.mapper.CmlSmsVerifyCodeMapper;
import cn.comelo.ehrsp.service.SmsVerifyCodeService;
import cn.comelo.pojo.CmlSmsVerifyCode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class SmsVerifyCodeServiceImpl implements SmsVerifyCodeService {

    @Autowired
    private CmlSmsVerifyCodeMapper cmlSmsVerifyCodeMapper;

    @Value("${cn.comelo.verifycode.validtime}")
    private int verifyCodeValidTime;

    @Override
    public void insertVerifyCode(CmlSmsVerifyCode cmlSmsVerifyCode) {
        cmlSmsVerifyCode.setCreateTime(new Date());
        cmlSmsVerifyCode.setUpdateTime(new Date());
        cmlSmsVerifyCodeMapper.insert(cmlSmsVerifyCode);
    }

    @Override
    public int isVerifyCodeValid(String mobile, String verifyCode) {
        return cmlSmsVerifyCodeMapper.isVerifyCodeValid(mobile, verifyCode, verifyCodeValidTime);
    }
}
