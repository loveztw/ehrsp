import cn.comelo.Application;
import cn.comelo.pojo.sms.SendSmsResponseAliyunBean;
import com.alibaba.fastjson.JSON;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class test {

    @Test
    public void test1() {
        String jasonString = "{\"Message\":\"OK\",\"RequestId\":\"87A01E9A-15B4-4C6B-ABAF-46387C007E15\",\"BizId\":\"804111067428407367^0\",\"Code\":\"OK\"}";
        SendSmsResponseAliyunBean resBean = JSON.parseObject(jasonString, SendSmsResponseAliyunBean.class);
        System.out.println(resBean.getCode());
    }
}