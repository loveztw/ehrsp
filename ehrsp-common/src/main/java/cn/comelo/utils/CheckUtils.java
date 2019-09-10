package cn.comelo.utils;

import org.springframework.util.StringUtils;

import java.util.regex.Pattern;

public class CheckUtils {

    /** 电话号码格式校验
     * TRUE: 正常
     * FALSE: 格式错误 */
    public static boolean checkTelNumber(String telNumber) {

        if (StringUtils.isEmpty(telNumber)) {
            return false;
        }

        String pattern = "^1[0-9]{10}$";
        return Pattern.matches(pattern, telNumber);
    }
}
