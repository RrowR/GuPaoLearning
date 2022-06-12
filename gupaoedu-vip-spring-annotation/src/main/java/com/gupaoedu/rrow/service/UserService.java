package com.gupaoedu.rrow.service;

import com.gupaoedu.rrow.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author: Rrow
 * @date: 2022/6/12 18:24
 */
@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    @Transactional          // 这个方法开启事务
    public void insertUser() {
        userDao.insert();
        System.out.println("插入完成");
        int i = 10 / 0;     // 开始报错
    }

}
