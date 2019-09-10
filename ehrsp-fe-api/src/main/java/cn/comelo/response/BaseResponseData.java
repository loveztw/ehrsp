package cn.comelo.response;

import lombok.Data;

@Data
public class BaseResponseData {
    /** 结果代码
     * 0， 正常
     * 非0， 异常*/
    private int code;

    private String detail;
}
