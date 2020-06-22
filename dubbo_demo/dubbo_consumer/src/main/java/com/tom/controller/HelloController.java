package com.tom.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.tom.service.HelloService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @File: HelloController
 * @Description:
 * @Author: tom
 * @Create: 2020-06-22 09:40
 **/
@RestController
@RequestMapping("/hello")
public class HelloController {

    @Reference
    private HelloService helloService;

    @RequestMapping("/sa")
    public String sayHello(String name) {
        String str = helloService.sayHello(name);
        System.out.println(str);
        return str;
    }

    @RequestMapping("/wr")
    public String sayWorld(String name) {
        String str = helloService.doWorld(name);
        System.out.println(str);
        return str;
    }
}
