package com.tom.bootdubboorderprovider.controller;

import com.tom.bootdubboorderprovider.service.ShoppingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @File: UserController
 * @Description:
 * @Author: tom
 * @Create: 2020-06-23 16:25
 **/
@RestController
public class UserController {

    @Autowired
    private ShoppingService shoppingService;

    @RequestMapping("/getPay")
    public String getUser(String uid) {
        return shoppingService.getShopping(uid);
    }
}
