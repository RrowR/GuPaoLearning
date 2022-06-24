package com.study.springbootthreaddemo.mapper;

import com.study.springbootthreaddemo.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
* @author atlantis
* @description 针对表【User】的数据库操作Mapper
* @createDate 2022-06-24 01:55:30
* @Entity com.study.springbootthreaddemo.bean.User
*/
@Mapper
public interface UserMapper {
    int insertUserByName(String name);

    int insertUser(@Param("user") User user);
}




