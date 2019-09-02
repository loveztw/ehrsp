package cn.comelo.controller;

import cn.comelo.ehrsp.service.EhrAdminService;
import cn.comelo.pojo.EhrAdmin;
import cn.comelo.pojo.QsMembers;
import cn.comelo.qscms.service.QsMembersService;
import cn.comelo.utils.JsonResponse;
import com.aliyuncs.CommonRequest;
import com.aliyuncs.CommonResponse;
import com.aliyuncs.DefaultAcsClient;
import com.aliyuncs.IAcsClient;
import com.aliyuncs.exceptions.ClientException;
import com.aliyuncs.exceptions.ServerException;
import com.aliyuncs.http.MethodType;
import com.aliyuncs.profile.DefaultProfile;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@Api("Test Controller")
@RestController
public class TestController {

    @Autowired
    private QsMembersService qsMembersService;

    @Autowired
    private EhrAdminService ehrAdminService;

    @Value("${aliyun.sms.accesskey}")
    private String smsAccesskey;

    @Value("${aliyun.sms.secret}")
    private String smsSecret;

    @Value("${aliyun.sms.signName}")
    private String smsSignName;

    @Value("${aliyun.sms.templateCode}")
    private String smsTemplateCode;

    @Value("${aliyun.sms.regionid}")
    private String smsRegionid;

    @ApiOperation("更新用户")
    @ApiImplicitParam(name = "qsMembers", value = "单个用户信息", dataType = "QsMembers")
    @PostMapping("/test")
    public JsonResponse login(@RequestBody QsMembers qsMembers) {
        String username = qsMembers.getUsername();
        String password = qsMembers.getPassword();

        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return JsonResponse.errorMsg("Username and password is required.");
        }

        QsMembers qsMembersDB = qsMembersService.queryUserInfo(username);
        if (qsMembersDB == null) {
            return JsonResponse.errorMsg("User is not exist.");
        }

        String passInDB = qsMembersDB.getPassword();
        if (password.equals(passInDB)) {
            return JsonResponse.ok();
        }

        return JsonResponse.errorMsg("Password is incorrect.");
    }

    @ApiOperation("测试ehrsp")
    @ApiImplicitParam(name = "qsMembers", value = "单个用户信息", dataType = "QsMembers")
    @PostMapping("/test1")
    public JsonResponse admin(@RequestBody EhrAdmin ehrAdmin) {
        String username = ehrAdmin.getUsername();
        String password = ehrAdmin.getPassword();

        if (StringUtils.isEmpty(username) || StringUtils.isEmpty(password)) {
            return JsonResponse.errorMsg("Username and password is required.");
        }

        EhrAdmin ehrAdminDB = ehrAdminService.queryAdminInfo(username);
        if (ehrAdminDB == null) {
            return JsonResponse.errorMsg("User is not exist.");
        }

        String passInDB = ehrAdminDB.getPassword();
        if (password.equals(passInDB)) {
            return JsonResponse.ok();
        }

        return JsonResponse.errorMsg("Password is incorrect.");
    }

    @ApiOperation("测试短信验证码")
    @ApiImplicitParam(name = "telNumber", value = "电话号码", dataType = "String")
    @PostMapping("/testsms")
    public JsonResponse testsms(String telNumber) {
        if (StringUtils.isEmpty(telNumber)) {
            return JsonResponse.errorMsg("tel is null");
        }

        DefaultProfile profile = DefaultProfile.getProfile(smsRegionid, smsAccesskey, smsSecret);
        IAcsClient client = new DefaultAcsClient(profile);

        CommonRequest request = new CommonRequest();
        request.setMethod(MethodType.POST);
        request.setDomain("dysmsapi.aliyuncs.com");
        request.setVersion("2017-05-25");
        request.setAction("SendSms");
        request.putQueryParameter("RegionId", smsRegionid);
        request.putQueryParameter("PhoneNumbers", telNumber);
        request.putQueryParameter("SignName", smsSignName);
        request.putQueryParameter("TemplateCode", smsTemplateCode);
        request.putQueryParameter("TemplateParam", "{code:" + "1234" + "}");
        try {
            CommonResponse response = client.getCommonResponse(request);
            System.out.println("=======" + response.getData());
        } catch (ServerException e) {
            e.printStackTrace();
        } catch (ClientException e) {
            e.printStackTrace();
        }
        return JsonResponse.ok();
    }
}
