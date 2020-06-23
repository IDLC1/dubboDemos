package com.tom.bootdubbouserconsumer.service.impl;

import com.tom.service.PayService;
import org.apache.dubbo.config.annotation.DubboService;

/**
 * @File: PayServiceImpl
 * @Description:
 * @Author: tom
 * @Create: 2020-06-23 16:43
 **/
@DubboService
public class PayServiceImpl implements PayService {
    @Override
    public String getPayId(String id) {
        return "订单ID为： " + id;
    }
}
