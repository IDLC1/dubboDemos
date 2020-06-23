package com.tom.bootdubboorderprovider.service.impl;

import com.tom.bean.UserAddress;
import com.tom.service.OrderService;
import com.tom.service.UserService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@DubboService
public class UserServiceImpl implements UserService {

    @Override
    public List<UserAddress> getUserAddressList(String userId) {
        UserAddress address1 = new UserAddress(1, "北京市", "1", "小王", "18030145000", "1");
        UserAddress address2 = new UserAddress(2, "杭州市", "2", "小北", "18030145999", "2");
        return Arrays.asList(address1, address2);
    }
}
