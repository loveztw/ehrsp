package cn.comelo.other.service.impl;

import cn.comelo.exception.MyException;
import cn.comelo.other.service.SmsService;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.Random;

@Service
public class SmsAliyunServiceImpl implements SmsService {

    private Logger logger = Logger.getLogger(getClass());

    @Value("${sms.signName}")
    private String smsSignName;

    @Value("${sms.templateCode}")
    private String smsTemplateCode;

    @Value("${sms.domain}")
    private String smsDomain;

    @Value("${sms.regionid}")
    private String smsRegionid;

    @Value("${sms.accesskey}")
    String smsAccesskey;

    @Value("${sms.secret}")
    String smsSecret;

    private IAcsClient client;

    @Override
    @PostConstruct
    public void init() {
        DefaultProfile profile = DefaultProfile.getProfile(smsRegionid, smsAccesskey, smsSecret);
        client = new DefaultAcsClient(profile);
    }

    @Override
    public String sendVerifyCode(String tel) throws MyException {
        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain(smsDomain);
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", smsRegionid);
        request.putQueryParameter("PhoneNumbers", tel);
        request.putQueryParameter("SignName", smsSignName);
        request.putQueryParameter("TemplateCode", smsTemplateCode);

        Random ra =new Random();
        int randNum = ra.nextInt(100000)+1;
        String randNumStr = String.format("%05d", randNum);
        logger.debug("send verify code: tel=" + tel + " , code=" + randNumStr);
        request.putQueryParameter("TemplateParam", "{code:" + randNumStr + "}");

//+++++++++++++++++++++++++++++++++++++++++++++++++
//调试时不需要发短信，正式使用时以下代码打开
//        CommonResponse response = null;
//        try {
//            response = client.getCommonResponse(request);
//        } catch (Exception e) {
//            logger.warn("SMS Send failed. errMsg=" + e.getMessage(), e);
//            throw new MyException(e.getMessage(), ResponseCode.RES_SEND_SMS_SEND_ERR);
//        }
//        SendSmsResponseAliyunBean resBean = JSON.parseObject(response.getData(), SendSmsResponseAliyunBean.class);
//        if (!resBean.getCode().equals("OK")){
//            logger.warn("Receive bad SMS response: code=" + resBean.getCode() + ", errMsg=" + resBean.getMessage());
//            throw new MyException("Receive bad SMS response: code=" + resBean.getCode() + ", errMsg=" + resBean.getMessage()
//                    , ResponseCode.RES_SEND_SMS_ERROR_RES);
//        }
//-------------------------------------------------
        return randNumStr;
    }
}
