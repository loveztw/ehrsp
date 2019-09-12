package cn.comelo.exception;

import cn.comelo.common.ResponseCode;
import cn.comelo.response.BaseResponseData;
import cn.comelo.utils.JsonResponse;
import org.apache.log4j.Logger;
import org.springframework.dao.DataAccessException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@RestControllerAdvice
public class ControllerExceptionHandler {

    private Logger logger = Logger.getLogger(getClass());

    @ExceptionHandler
    public JsonResponse handler(HttpServletRequest req, HttpServletResponse res, Exception e) {

        BaseResponseData responseData = new BaseResponseData();

        if (e instanceof DataAccessException) {
            logger.error("DB access failed.", e);
            responseData.setCode(ResponseCode.RES_DB_ACCESS_ERROR);
            responseData.setDetail("DB access failed.");
            return JsonResponse.errorMap(responseData);
        } else {
            logger.error("Unknown exception.", e);
            responseData.setCode(ResponseCode.RES_UNKNOWN_EXCEPTION);
            responseData.setDetail("Unknown Exception.");
            return JsonResponse.errorMap(responseData);
        }
    }
}
