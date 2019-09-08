package cn.comelo.ehrsp.service;


import cn.comelo.pojo.CmlUser;

public interface UserService {

    /** 给用户发送的验证码插入到数据库 */
    public CmlUser findUserByTel(String tel);
}
