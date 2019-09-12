package cn.comelo.common;

public class ResponseCode {

    /** 共用 */
    public static final int RES_OK = 0x0;

    /** 无效的电话号码 */
    public static final int RES_INVALID_TELNUM = 0x9001;

    /** 电话号码已存在 */
    public static final int RES_TELNUM_EXIST = 0x9002;

    /** Unknown exception */
    public static final int RES_UNKNOWN_EXCEPTION = 0x9003;

    /** Invalid verify code */
    public static final int RES_INVALID_VERIFYCODE = 0x9004;

    /** Invalid register info */
    public static final int RES_INVALID_REGINFO = 0x9005;

    /** Mobile is already registered. */
    public static final int RES_MOBILE_EXIST = 0x9006;

    /** Send SMS Code */
    /** Send failed */
    public static final int RES_SEND_SMS_SEND_ERR = 0x9101;

    /** error response from SMS Service */
    public static final int RES_SEND_SMS_ERROR_RES = 0x9102;

    /** DB Access error */
    public static final int RES_DB_ACCESS_ERROR = 0x9201;
}
