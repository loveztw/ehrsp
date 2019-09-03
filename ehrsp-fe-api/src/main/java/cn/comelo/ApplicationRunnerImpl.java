package cn.comelo;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class ApplicationRunnerImpl implements ApplicationRunner {
    //系统初始化处理接口
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("================== System init process. ====================");
    }
}
