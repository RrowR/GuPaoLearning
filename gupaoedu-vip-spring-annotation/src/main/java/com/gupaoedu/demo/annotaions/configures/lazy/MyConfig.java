package com.gupaoedu.demo.annotaions.configures.lazy;

import com.gupaoedu.project.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

@Configuration
public class MyConfig {

    //懒加载只针对单例Bean起作用
    //默认容器启动时不创建对象，调用对象的功能时才创建
    // @Lazy
    @Bean
    public Person person() {
        System.out.println("Bean has in IOC");
        return new Person("Tom", 18);
    }
}
