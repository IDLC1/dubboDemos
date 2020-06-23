package com.tom.bootdubbouserconsumer.controller;

import com.tom.bean.UserAddress;
import com.tom.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @File: OrderController
 * @Description:
 * @Author: tom
 * @Create: 2020-06-23 10:38
 **/
@RestController
public class OrderController {

    @Autowired
    private OrderService orderService;

    @RequestMapping("/initOrder")
    public List<UserAddress> initOrder(String userId) {
        List<UserAddress> list = orderService.initOrder(userId);
        return list;
    }
}
