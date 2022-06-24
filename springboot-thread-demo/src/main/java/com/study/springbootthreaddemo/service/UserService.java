package com.study.springbootthreaddemo.service;

import com.study.springbootthreaddemo.bean.User;
import org.apache.ibatis.annotations.Param;

/**
* @author atlantis
* @description 针对表【User】的数据库操作Service
* @createDate 2022-06-24 01:55:30
*/
public interface UserService {
    int insertUser(String name);

    int insertUser(User user);
}
