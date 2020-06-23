package com.tom.bootdubbouserconsumer.service.impl;

import com.tom.bean.UserAddress;
import com.tom.service.OrderService;
import com.tom.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @DubboReference
    UserService userService;

    @Override
    public List<UserAddress> initOrder(String userId) {
        System.out.println("用户ID: " + userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress item : addressList) {
            System.out.println(item.getUserAddress());
        }
        return addressList;
    }
}
