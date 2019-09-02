package cn.comelo.sms.aliyun;

import cn.comelo.sms.SmsService;
import com.alibaba.fastjson.JSON;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import org.springframework.beans.factory.annotation.Value;

import java.util.Random;

public class SmsAliyunServiceImpl implements SmsService {

    @Value("${sms.signName}")
    private String smsSignName;

    @Value("${sms.templateCode}")
    private String smsTemplateCode;

    @Value("${sms.accesskey}")
    private String smsAccesskey;

    @Value("${sms.secret}")
    private String smsSecret;

    @Value("${sms.regionid}")
    private String smsRegionid;

    @Value("${sms.domain}")
    private String smsDomain;

    private IAcsClient client;

    @Override
    public void init() {
        DefaultProfile profile = DefaultProfile.getProfile(smsRegionid, smsAccesskey, smsSecret);
        client = new DefaultAcsClient(profile);
    }

    @Override
    public String sendVerifyCode(String tel) {
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
        String randNumStr = String.format("%06d", randNum);
        request.putQueryParameter("TemplateParam", "{code:" + randNumStr + "}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            //System.out.println("=======" + response.getData());
            SendSmsResponseAliyunBean resBean = JSON.parseObject(response.getData(), SendSmsResponseAliyunBean.class);
            if (!resBean.getCode().equals("OK")){
                return null;
            }
            return randNumStr;
        } catch (Exception e) {
            return null;
        }
    }
}
