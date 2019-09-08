package cn.comelo.ehrsp.service.impl;

import cn.comelo.ehrsp.mapper.CmlSmsVerifyCodeMapper;
import cn.comelo.ehrsp.service.SmsVerifyCodeService;
import cn.comelo.pojo.CmlSmsVerifyCode;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;
import tk.mybatis.mapper.entity.Example;

import java.util.Date;

@Service
public class SmsVerifyCodeServiceImpl implements SmsVerifyCodeService {

    @Autowired
    public CmlSmsVerifyCodeMapper cmlSmsVerifyCodeMapper;

    @Override
    public void insertVerifyCode(CmlSmsVerifyCode cmlSmsVerifyCode) {
        cmlSmsVerifyCode.setCreateTime(new Date());
        cmlSmsVerifyCode.setUpdateTime(new Date());

        Example example = new Example(CmlSmsVerifyCode.class);
        Example.Criteria criteria = example.createCriteria();
        String userid = cmlSmsVerifyCode.getUserid();
        String mobile = cmlSmsVerifyCode.getMobile();
        if (!StringUtils.isEmpty(userid)) {
            //userid存在
            criteria.andEqualTo("userid", userid);
        } else {
            //电话号码存在
            criteria.andEqualTo("mobile", mobile);
        }
        CmlSmsVerifyCode dbCmlSmsVerifyCode =  cmlSmsVerifyCodeMapper.selectOneByExample(example);
        if (dbCmlSmsVerifyCode != null) {
            cmlSmsVerifyCodeMapper.updateByExample(cmlSmsVerifyCode, example);
        } else {
            cmlSmsVerifyCodeMapper.insert(cmlSmsVerifyCode);
        }
    }
}
