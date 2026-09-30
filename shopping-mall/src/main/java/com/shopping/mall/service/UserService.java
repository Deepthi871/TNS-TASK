package com.shopping.mall.service;

import com.shopping.mall.entity.User;

public interface UserService {
    User addUser(User user);
    User getUser(int id);
    User updateUser(User user);
    void deleteUser(int id);
}