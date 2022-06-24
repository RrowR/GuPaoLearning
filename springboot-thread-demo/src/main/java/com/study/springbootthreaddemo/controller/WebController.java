package com.study.springbootthreaddemo.controller;

import com.study.springbootthreaddemo.bean.User;
import com.study.springbootthreaddemo.service.SmsClient;
import com.study.springbootthreaddemo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.*;

/**
 * @author: Rrow
 * @date: 2022/6/24 2:01
 */
@RestController
public class WebController {

    private static final ExecutorService pool = Executors.newFixedThreadPool(10);

    @Autowired
    private UserService userService;
    @Autowired
    private SmsClient smsClient;

    @Value("${alisms.phoneNumbers}")
    private String mobile;

    @GetMapping("aaa")
    public String insertUser(String name) {
        long start = System.currentTimeMillis();
        userService.insertUser(name);
        String sumTime = String.valueOf(((System.currentTimeMillis() - start)));
        return "Success,时间为" + sumTime;
    }

    @PostMapping("/sms/user")
    public String register(User user) throws Exception {
        long start = System.currentTimeMillis();
        // pool.submit(() -> {
        //     // 线程异步执行,优化执行时间
        //     try {
        //         smsClient.sendSms(mobile);
        //     } catch (Exception e) {
        //         throw new RuntimeException(e);
        //     }
        // });
        Future<Object> future = pool.submit(() -> smsClient.sendSms(mobile));
        userService.insertUser(user);
        String sumTime = String.valueOf(((System.currentTimeMillis() - start)));
        return future.get().toString();
    }

}
