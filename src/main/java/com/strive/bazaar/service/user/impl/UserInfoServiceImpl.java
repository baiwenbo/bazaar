package com.strive.bazaar.service.user.impl;


import com.strive.bazaar.dao.UserInfoDao;
import com.strive.bazaar.entity.UserInfo;
import com.strive.bazaar.service.user.UserInfoService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoServiceImpl implements UserInfoService {
    @Resource
    private UserInfoDao userInfoDao;
    @Override
    public UserInfo findByUsername(String username) {
        System.out.println("UserInfoServiceImpl.findByUsername()");
        return userInfoDao.findByUsername(username);
    }
}