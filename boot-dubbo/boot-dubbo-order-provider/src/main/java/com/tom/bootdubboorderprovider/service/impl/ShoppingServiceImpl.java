package com.tom.bootdubboorderprovider.service.impl;

import com.tom.bootdubboorderprovider.service.ShoppingService;
import com.tom.service.PayService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.springframework.stereotype.Service;

/**
 * @File: ShoppingServiceImpl
 * @Description:
 * @Author: tom
 * @Create: 2020-06-23 16:50
 **/
@Service
public class ShoppingServiceImpl implements ShoppingService {

    @DubboReference
    private PayService payService;

    @Override
    public String getShopping(String uid) {
        return payService.getPayId(uid);
    }
}
