package com.mybatisxml.demo6.mapper;

import com.mybatisxml.demo6.model.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

     List<User> findAll();

     void insertUser(User user);

}
