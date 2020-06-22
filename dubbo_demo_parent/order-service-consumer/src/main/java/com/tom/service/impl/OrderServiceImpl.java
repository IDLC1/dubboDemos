package com.tom.service.impl;

import com.tom.bean.UserAddress;
import com.tom.service.OrderService;
import com.tom.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    UserService userService;

    public void initOrder(String userId) {
        System.out.println("用户ID: " + userId);
        List<UserAddress> addressList = userService.getUserAddressList(userId);
        for (UserAddress item : addressList) {
            System.out.println(item.getUserAddress());
        }
    }
}
