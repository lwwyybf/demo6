package com.mybatisxml.demo6.service;

import com.mybatisxml.demo6.model.User;


import java.util.List;


public interface UserServcie {

    public List<User> findAll();

    public void insertUser(User user);
}
