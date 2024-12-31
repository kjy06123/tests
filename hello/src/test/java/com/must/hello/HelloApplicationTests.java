package com.must.hello;

import com.must.hello.controller.HelloController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest //标识此类为测试类，并加载项目上下文环境
class HelloApplicationTests {
    @Autowired //让spring完成bean对象的自动装配工作
    // private HelloController helloController;

    @Test //测试方法书写处
    void contextLoads() {
        System.out.println(HelloController.sayHello());
    }

}
