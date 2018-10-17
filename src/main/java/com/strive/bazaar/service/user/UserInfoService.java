package com.strive.bazaar.service.user;


import com.strive.bazaar.entity.UserInfo;

public interface UserInfoService {
    /**通过username查找用户信息;*/
    public UserInfo findByUsername(String username);
}