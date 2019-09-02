package cn.comelo.pojo;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(name = "qs_members")
public class QsMembers {
    @Id
    private Integer uid;

    private Boolean utype;

    private String username;

    private String email;

    @Column(name = "email_audit")
    private Boolean emailAudit;

    private String mobile;

    @Column(name = "mobile_audit")
    private Boolean mobileAudit;

    private String password;

    @Column(name = "pwd_hash")
    private String pwdHash;

    @Column(name = "reg_time")
    private Integer regTime;

    @Column(name = "reg_ip")
    private String regIp;

    @Column(name = "reg_address")
    private String regAddress;

    @Column(name = "last_login_time")
    private Integer lastLoginTime;

    @Column(name = "last_login_ip")
    private String lastLoginIp;

    private Byte status;

    private String avatars;

    private Byte robot;

    private Short consultant;

    private String imei;

    @Column(name = "sms_num")
    private Integer smsNum;

    @Column(name = "invitation_code")
    private String invitationCode;

    @Column(name = "sitegroup_uid")
    private Integer sitegroupUid;

    @Column(name = "reg_source")
    private Boolean regSource;

    @Column(name = "reg_source_cn")
    private String regSourceCn;

    private String secretkey;

    /**
     * @return uid
     */
    public Integer getUid() {
        return uid;
    }

    /**
     * @param uid
     */
    public void setUid(Integer uid) {
        this.uid = uid;
    }

    /**
     * @return utype
     */
    public Boolean getUtype() {
        return utype;
    }

    /**
     * @param utype
     */
    public void setUtype(Boolean utype) {
        this.utype = utype;
    }

    /**
     * @return username
     */
    public String getUsername() {
        return username;
    }

    /**
     * @param username
     */
    public void setUsername(String username) {
        this.username = username;
    }

    /**
     * @return email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return email_audit
     */
    public Boolean getEmailAudit() {
        return emailAudit;
    }

    /**
     * @param emailAudit
     */
    public void setEmailAudit(Boolean emailAudit) {
        this.emailAudit = emailAudit;
    }

    /**
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return mobile_audit
     */
    public Boolean getMobileAudit() {
        return mobileAudit;
    }

    /**
     * @param mobileAudit
     */
    public void setMobileAudit(Boolean mobileAudit) {
        this.mobileAudit = mobileAudit;
    }

    /**
     * @return password
     */
    public String getPassword() {
        return password;
    }

    /**
     * @param password
     */
    public void setPassword(String password) {
        this.password = password;
    }

    /**
     * @return pwd_hash
     */
    public String getPwdHash() {
        return pwdHash;
    }

    /**
     * @param pwdHash
     */
    public void setPwdHash(String pwdHash) {
        this.pwdHash = pwdHash;
    }

    /**
     * @return reg_time
     */
    public Integer getRegTime() {
        return regTime;
    }

    /**
     * @param regTime
     */
    public void setRegTime(Integer regTime) {
        this.regTime = regTime;
    }

    /**
     * @return reg_ip
     */
    public String getRegIp() {
        return regIp;
    }

    /**
     * @param regIp
     */
    public void setRegIp(String regIp) {
        this.regIp = regIp;
    }

    /**
     * @return reg_address
     */
    public String getRegAddress() {
        return regAddress;
    }

    /**
     * @param regAddress
     */
    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress;
    }

    /**
     * @return last_login_time
     */
    public Integer getLastLoginTime() {
        return lastLoginTime;
    }

    /**
     * @param lastLoginTime
     */
    public void setLastLoginTime(Integer lastLoginTime) {
        this.lastLoginTime = lastLoginTime;
    }

    /**
     * @return last_login_ip
     */
    public String getLastLoginIp() {
        return lastLoginIp;
    }

    /**
     * @param lastLoginIp
     */
    public void setLastLoginIp(String lastLoginIp) {
        this.lastLoginIp = lastLoginIp;
    }

    /**
     * @return status
     */
    public Byte getStatus() {
        return status;
    }

    /**
     * @param status
     */
    public void setStatus(Byte status) {
        this.status = status;
    }

    /**
     * @return avatars
     */
    public String getAvatars() {
        return avatars;
    }

    /**
     * @param avatars
     */
    public void setAvatars(String avatars) {
        this.avatars = avatars;
    }

    /**
     * @return robot
     */
    public Byte getRobot() {
        return robot;
    }

    /**
     * @param robot
     */
    public void setRobot(Byte robot) {
        this.robot = robot;
    }

    /**
     * @return consultant
     */
    public Short getConsultant() {
        return consultant;
    }

    /**
     * @param consultant
     */
    public void setConsultant(Short consultant) {
        this.consultant = consultant;
    }

    /**
     * @return imei
     */
    public String getImei() {
        return imei;
    }

    /**
     * @param imei
     */
    public void setImei(String imei) {
        this.imei = imei;
    }

    /**
     * @return sms_num
     */
    public Integer getSmsNum() {
        return smsNum;
    }

    /**
     * @param smsNum
     */
    public void setSmsNum(Integer smsNum) {
        this.smsNum = smsNum;
    }

    /**
     * @return invitation_code
     */
    public String getInvitationCode() {
        return invitationCode;
    }

    /**
     * @param invitationCode
     */
    public void setInvitationCode(String invitationCode) {
        this.invitationCode = invitationCode;
    }

    /**
     * @return sitegroup_uid
     */
    public Integer getSitegroupUid() {
        return sitegroupUid;
    }

    /**
     * @param sitegroupUid
     */
    public void setSitegroupUid(Integer sitegroupUid) {
        this.sitegroupUid = sitegroupUid;
    }

    /**
     * @return reg_source
     */
    public Boolean getRegSource() {
        return regSource;
    }

    /**
     * @param regSource
     */
    public void setRegSource(Boolean regSource) {
        this.regSource = regSource;
    }

    /**
     * @return reg_source_cn
     */
    public String getRegSourceCn() {
        return regSourceCn;
    }

    /**
     * @param regSourceCn
     */
    public void setRegSourceCn(String regSourceCn) {
        this.regSourceCn = regSourceCn;
    }

    /**
     * @return secretkey
     */
    public String getSecretkey() {
        return secretkey;
    }

    /**
     * @param secretkey
     */
    public void setSecretkey(String secretkey) {
        this.secretkey = secretkey;
    }
}