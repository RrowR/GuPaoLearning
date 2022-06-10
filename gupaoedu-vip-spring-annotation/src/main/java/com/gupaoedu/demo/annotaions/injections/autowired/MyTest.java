package com.gupaoedu.demo.annotaions.injections.autowired;

import com.gupaoedu.project.controller.MyController;
import com.gupaoedu.project.dao.MyDao;
import com.gupaoedu.project.service.MyService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.env.Environment;

import java.util.Arrays;

/**
 * Created by Tom.
 */
public class MyTest {
    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Object controller = app.getBean("myController");
        System.out.println(controller);

        MyService service = app.getBean(MyService.class);
        service.print();

        MyDao dao = app.getBean(MyDao.class);
        System.out.println(dao);
    }

    @Test
    public void test02(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        // 这里要类名首字母小写
        Object myController = app.getBean("myController");
        System.out.println(myController);
    }

    /*
    * 判断注入的是不是同一个对象
    * */
    @Test
    public void test03(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        MyService myService = app.getBean(MyService.class);
        myService.print();

        MyDao myDao = app.getBean(MyDao.class);
        System.out.println(myDao);
    }
}
