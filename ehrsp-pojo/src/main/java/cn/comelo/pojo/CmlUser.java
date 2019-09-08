package cn.comelo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Date;

@Table(name = "cml_user")
public class CmlUser {
    /**
     * 用户id
     */
    @Id
    private String userid;

    /**
     * 电话号码
     */
    private String mobile;

    /**
     * 邮箱地址
     */
    private String mail;

    /**
     * 邮箱是否认证，0：没有认证，1：已认证
     */
    @Column(name = "mail_auth")
    private Integer mailAuth;

    /**
     * 用户名
     */
    private String username;

    /**
     * 密码，base64加密
     */
    private String password;

    /**
     * 用户最近登录时间
     */
    @Column(name = "loging_time")
    private Date logingTime;

    /**
     * 记录最近更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 记录创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 获取用户id
     *
     * @return userid - 用户id
     */
    public String getUserid() {
        return userid;
    }

    /**
     * 设置用户id
     *
     * @param userid 用户id
     */
    public void setUserid(String userid) {
        this.userid = userid;
    }

    /**
     * 获取电话号码
     *
     * @return mobile - 电话号码
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * 设置电话号码
     *
     * @param mobile 电话号码
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * 获取邮箱地址
     *
     * @return mail - 邮箱地址
     */
    public String getMail() {
        return mail;
    }

    /**
     * 设置邮箱地址
     *
     * @param mail 邮箱地址
     */
    public void setMail(String mail) {
        this.mail = mail;
    }

    /**
     * 获取邮箱是否认证，0：没有认证，1：已认证
     *
     * @return mail_auth - 邮箱是否认证，0：没有认证，1：已认证
     */
    public Integer getMailAuth() {
        return mailAuth;
    }

    /**
     * 设置邮箱是否认证，0：没有认证，1：已认证
     *
     * @param mailAuth 邮箱是否认证，0：没有认证，1：已认证
     */
    public void setMailAuth(Integer mailAuth) {
        this.mailAuth = mailAuth;
    }

    /**
     * 获取用户名
     *
     * @return username - 用户名
     */
    public String getUsername() {
        return username;
    }

    /**
     * 设置用户名
     *
     * @param username 用户名
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * 获取密码，base64加密
     *
     * @return password - 密码，base64加密
     */
    public String getPassword() {
        return password;
    }

    /**
     * 设置密码，base64加密
     *
     * @param password 密码，base64加密
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * 获取用户最近登录时间
     *
     * @return loging_time - 用户最近登录时间
     */
    public Date getLogingTime() {
        return logingTime;
    }

    /**
     * 设置用户最近登录时间
     *
     * @param logingTime 用户最近登录时间
     */
    public void setLogingTime(Date logingTime) {
        this.logingTime = logingTime;
    }

    /**
     * 获取记录最近更新时间
     *
     * @return update_time - 记录最近更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置记录最近更新时间
     *
     * @param updateTime 记录最近更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取记录创建时间
     *
     * @return create_time - 记录创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置记录创建时间
     *
     * @param createTime 记录创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}