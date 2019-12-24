package com.offcn.service.impl;

import com.offcn.mapper.UserMapper;
import com.offcn.pojo.User;
import com.offcn.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: wyan
 * @Date: 2019-12-18 15:12
 * @Description:
 */
@Service
public class UserServiceImpl implements UserService {

    //注入user的mapper
    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {

        return userMapper.findAll();

    }

    @Override
    public void saveUser(User user) {
        userMapper.saveUser(user);
    }

    @Override
    public User findOne(Integer id) {
        return userMapper.findOne(id);
    }

    @Override
    public void deleteUser(Integer id) {
        userMapper.deleteById(id);
    }

    @Override
    public void updateUser(User user) {
        userMapper.updateUser(user);
    }

}
