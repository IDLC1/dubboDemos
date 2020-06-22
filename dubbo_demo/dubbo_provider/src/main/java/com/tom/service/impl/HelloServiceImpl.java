package com.tom.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.tom.service.HelloService;

/**
 * @File: HelloServiceImpl
 * @Description:
 * @Author: tom
 * @Create: 2020-06-22 09:44
 **/
@Service
public class HelloServiceImpl implements HelloService {
    public String sayHello(String name) {
        return "hello " + name ;
    }

    public String doWorld(String world) {
        return "world " + world;
    }
}
