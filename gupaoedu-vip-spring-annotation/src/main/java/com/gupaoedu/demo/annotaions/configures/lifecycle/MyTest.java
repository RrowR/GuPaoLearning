package com.gupaoedu.demo.annotaions.configures.lifecycle;

import com.gupaoedu.project.entity.AirPlane;
import com.gupaoedu.project.entity.Train;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Tom.
 */
public class MyTest {
    @Test
    public void test(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("IoC容器创建完成");
//        System.out.println(app.getBean("car"));
        System.out.println(app.getBean("train"));

        System.out.println(app.getBean("airPlane"));
        app.close();
    }

    @Test
    public void test02(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Object car = app.getBean("car");
        System.out.println(car);
        app.close();
    }

    @Test
    public void test03(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Object train = app.getBean("train");
        System.out.println(train);
        app.close();
    }

    @Test
    public void test04(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Object train = app.getBean("train");
        app.close();
    }

    @Test
    public void test05(){
        AnnotationConfigApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        // app.getBean(AirPlane.class);
        app.close();
    }
}
