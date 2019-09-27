package cn.comelo.ehrsp.service;


import cn.comelo.pojo.CmlUser;

public interface UserService {

    /** 根据电话号码查询用户信息 */
    public CmlUser findUserByTel(String tel);

    /** 根据Userid查询用户信息 */
    public CmlUser findUserById(String userid);

    /** 根据邮箱查询用户信息 */
    public CmlUser findUserByMail(String mail);

    /** 用户信息登录 */
    public void insertUser(CmlUser cmlUser);
}
