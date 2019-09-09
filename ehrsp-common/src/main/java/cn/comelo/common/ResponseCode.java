package cn.comelo.common;

public class ResponseCode {

    /** 共用 */
    public static final int RES_OK = 0x0;

    /** Send SMS Code */
    /** Send failed */
    public static final int RES_SEND_SMS_SEND_ERR = 0x0001;

    /** error response from SMS Service */
    public static final int RES_SEND_SMS_ERROR_RES = 0x0002;
}
