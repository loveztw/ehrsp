package cn.comelo.common;

public class ResponseCode {

    /** 共用 */
    public static final int RES_OK = 0x0;

    /** 无效的电话号码 */
    public static final int RES_INVALID_TELNUM = 0x9001;

    /** 电话号码已存在 */
    public static final int RES_TELNUM_EXIST = 0x9002;

    /** Send SMS Code */
    /** Send failed */
    public static final int RES_SEND_SMS_SEND_ERR = 0x9101;

    /** error response from SMS Service */
    public static final int RES_SEND_SMS_ERROR_RES = 0x9102;


}
