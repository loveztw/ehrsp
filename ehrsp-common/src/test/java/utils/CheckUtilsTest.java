package utils;

import cn.comelo.utils.CheckUtils;
import org.junit.Test;

public class CheckUtilsTest {
    @Test
    public void checkTelNumberTest() {
        String tel = "23554349283";

        boolean ret = CheckUtils.checkTelNumber(tel);
        System.out.println(ret);
    }
}
