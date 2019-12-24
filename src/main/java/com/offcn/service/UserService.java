package com.offcn.service;

import com.offcn.pojo.User;

import java.util.List;

/**
 * @Auther: wyan
 * @Date: 2019-12-18 15:12
 * @Description:
 */
public interface UserService {
    List<User> findAll();

    void saveUser(User user);

    User findOne(Integer id);

    void deleteUser(Integer id);

    void updateUser(User user);
}
