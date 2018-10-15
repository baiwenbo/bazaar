package com.strive.bazaar.dao;

import com.strive.bazaar.model.UserDomain;

import java.util.List;

public interface UserDao {

    int insert(UserDomain record);



    List<UserDomain> selectUsers();
}
