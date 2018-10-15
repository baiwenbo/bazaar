package com.strive.bazaar.service.user;

import com.github.pagehelper.PageInfo;
import com.strive.bazaar.model.UserDomain;

public interface UserService {

    int addUser(UserDomain user);

    PageInfo<UserDomain> findAllUser(int pageNum, int pageSize);
}
