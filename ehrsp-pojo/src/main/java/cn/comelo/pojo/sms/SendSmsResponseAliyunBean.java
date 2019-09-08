package cn.comelo.pojo.sms;

import lombok.Data;

/*
    阿里云短信服务的response构造
*/
@Data
public class SendSmsResponseAliyunBean {

    //"{
    //      \"Message\":\"OK\",
    //      \"RequestId\":\"87A01E9A-15B4-4C6B-ABAF-46387C007E15\",
    //      \"BizId\":\"804111067428407367^0\",
    //      \"Code\":\"OK\"
    // }";
    private String message;

    private String requestId;

    private String bizId;

    private String code;
}
