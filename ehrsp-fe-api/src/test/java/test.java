import cn.comelo.pojo.sms.SendSmsResponseAliyunBean;
import com.alibaba.fastjson.JSON;
import org.junit.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

//@RunWith(SpringRunner.class)
//@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class test {

    @Test
    public void test1() {
        String jasonString = "{\"Message\":\"OK\",\"RequestId\":\"87A01E9A-15B4-4C6B-ABAF-46387C007E15\",\"BizId\":\"804111067428407367^0\",\"Code\":\"OK\"}";
        SendSmsResponseAliyunBean resBean = JSON.parseObject(jasonString, SendSmsResponseAliyunBean.class);
        System.out.println(resBean.getCode());
    }

    @Test
    public void test2() {

        DateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");//设置日期格式
        System.out.println(df.format(new Date()));// new Date()为获取当前系统时间
        Calendar cal = Calendar.getInstance();
        TimeZone timeZone = cal.getTimeZone();
        System.out.println(timeZone.getID());
        System.out.println(timeZone.getDisplayName());
    }
}