package cn.comelo.sms;

import cn.comelo.sms.aliyun.SmsAliyunServiceImpl;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class SmsServiceFactory {

    public static final int SMS_SERVICE_TYPE_ALIYUN = 1;

    private static Map<Integer, SmsService> instances = new ConcurrentHashMap<Integer, SmsService>();

    public static SmsService getInstance(int serviceType){
        SmsService instance = instances.get(serviceType);
        if( instance == null ) {
            synchronized (SmsServiceFactory.class) {
                instance = instances.get(serviceType);
                if( instance == null ) {
                    instance = createSmsService(serviceType);
                    instances.put(serviceType, instance);
                }
            }
        }
        return instance;
    }


    public static SmsService createSmsService(int serviceType) {

        SmsService smsService = null;

        switch (serviceType) {
            case SMS_SERVICE_TYPE_ALIYUN:
                smsService = new SmsAliyunServiceImpl();
                smsService.init();
                break;
            default:
                return null;
        }

        return smsService;
    }
}
