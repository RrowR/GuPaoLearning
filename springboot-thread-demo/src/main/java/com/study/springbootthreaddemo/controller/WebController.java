package com.study.springbootthreaddemo.controller;

import com.study.springbootthreaddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: Rrow
 * @date: 2022/6/24 2:01
 */
@RestController
public class WebController {

    @Autowired
    private UserService userService;

    @GetMapping("aaa")
    public String insertUser(String name){
        long start = System.currentTimeMillis();
        userService.insertUser(name);
        String sumTime = String.valueOf(((System.currentTimeMillis() - start)));
        return "Success,时间为" + sumTime;
    }

}
