package cn.comelo.ehrsp.mapper;

import cn.comelo.pojo.CmlSmsVerifyCode;
import cn.comelo.utils.MyMapper;
import org.apache.ibatis.annotations.Select;

public interface CmlSmsVerifyCodeMapper extends MyMapper<CmlSmsVerifyCode> {

    @Select("select count(*) from cml_sms_verify_code where mobile = #{mobile} and verify_code = #{verifyCode} and DATE_SUB(NOW(),INTERVAL #{timeout_min} MINUTE) <= create_time")
    public int isVerifyCodeValid(String mobile, String verifyCode, int timeout_min);
}