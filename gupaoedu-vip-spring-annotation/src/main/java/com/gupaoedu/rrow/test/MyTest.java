package com.gupaoedu.rrow.test;

import com.gupaoedu.rrow.config.RrowMyConfig;
import com.gupaoedu.rrow.interfaces.User;
import com.gupaoedu.rrow.service.UserService;
import com.gupaoedu.rrow.weave.AppUtil;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author: Rrow
 * @date: 2022/6/11 15:55
 */
public class MyTest {

    @Test
    public void testPrimary(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(RrowMyConfig.class);
        User user = app.getBean(User.class);
        System.out.println(user);
    }

    @Test
    public void testApplicationContextAware(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(RrowMyConfig.class);
        AppUtil appUtil = app.getBean(AppUtil.class);
        appUtil.getAllBeans();
    }

    @Test
    public void testTransaction(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(RrowMyConfig.class);
        UserService userService = app.getBean(UserService.class);
        userService.insertUser();
        app.close();
    }

}
