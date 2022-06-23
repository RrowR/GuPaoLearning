package com.study.springbootthreaddemo.service.impl;

import com.study.springbootthreaddemo.bean.User;
import com.study.springbootthreaddemo.mapper.UserMapper;
import com.study.springbootthreaddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
* @author atlantis
* @description 针对表【User】的数据库操作Service实现
* @createDate 2022-06-24 01:55:30
*/
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    private UserMapper userMapper;

    @Override
    public int insertUser(String name) {
        return userMapper.insertUser(name);
    }
}




