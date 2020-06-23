package com.tom.bootdubboorderprovider;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class BootDubboOrderProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootDubboOrderProviderApplication.class, args);
    }
}
