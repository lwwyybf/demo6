package com.mybatisxml.demo6.service.impl;

import com.mybatisxml.demo6.mapper.UserMapper;
import com.mybatisxml.demo6.model.User;
import com.mybatisxml.demo6.service.UserServcie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServcie {

    @Autowired
    private UserMapper userMapper;

    @Override
    public List<User> findAll() {
        return userMapper.findAll();
    }

    @Override
    public void insertUser(User user) {
        userMapper.insertUser(user);
    }


}
