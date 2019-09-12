package cn.comelo.ehrsp.service.impl;

import cn.comelo.ehrsp.mapper.CmlUserMapper;
import cn.comelo.ehrsp.service.UserService;
import cn.comelo.pojo.CmlUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private CmlUserMapper cmlUserMapper;

    @Override
    public CmlUser findUserByTel(String tel) {
        CmlUser cmlUser = new CmlUser();
        cmlUser.setMobile(tel);
        return cmlUserMapper.selectOne(cmlUser);
    }

    @Override
    public void insertUser(CmlUser cmlUser) {
        cmlUserMapper.insert(cmlUser);
    }
}
