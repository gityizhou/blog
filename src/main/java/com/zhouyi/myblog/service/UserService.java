package com.zhouyi.myblog.service;

import com.zhouyi.myblog.po.User;

public interface UserService {

    User checkUser(String username, String password);
}
