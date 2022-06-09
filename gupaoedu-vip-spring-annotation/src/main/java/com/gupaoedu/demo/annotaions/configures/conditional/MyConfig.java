package com.gupaoedu.demo.annotaions.configures.conditional;

import com.gupaoedu.project.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Conditional(WinCondition.class)
    @Bean
    public Person mic(){
        System.out.println("Mic in IOC");
        return new Person("Mic",16);
    }

    @Conditional(WinCondition.class)
    @Bean
    public Person tom(){
        System.out.println("Tom in IOC");
        return new Person("Tom",18);
    }

    @Conditional(LinuxCondition.class)
    @Bean
    public Person james(){
        System.out.println("James in IOC");
        return new Person("James",17);
    }
}
