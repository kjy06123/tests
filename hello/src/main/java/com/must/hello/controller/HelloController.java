package com.must.hello.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//@Controller//标识了该类为控制器类，控制器负责处理请求，该类下的方法会被扫描到。
//@ResponseBody
@RestController
public class HelloController {
    @GetMapping("/hello")//将get类型的请求映射到相应的处理方法上
    //@ResponseBody//把return后的数据返回给客户端
    public static String sayHello(){//真正处理请求的方法
        return  "hello world";
    }
    @GetMapping("/bye")
    //@ResponseBody
    public static String sayBye(){
        return  "bye ";
    }

}
