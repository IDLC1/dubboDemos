package com.tom.service;

import com.tom.bean.UserAddress;

import java.util.List;

public interface UserService {

    public List<UserAddress> getUserAddressList(String userId);
}
