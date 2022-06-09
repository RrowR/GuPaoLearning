package com.gupaoedu.demo.annotaions.configures.imports;

import com.gupaoedu.project.entity.Cat;
import com.gupaoedu.project.entity.Company;
import com.gupaoedu.project.entity.Member;
import com.gupaoedu.project.entity.Monkey;
import org.junit.Test;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Arrays;

/**
 * Created by Tom.
 */
public class MyTest {

    @Test
    public void test(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);

        //通过FactoryBean注入的值
        System.out.println("============" + app.getBean("monkey").getClass());
        Object monkey1 = app.getBean("monkey");
        Object monkey2 = app.getBean("monkey");
        System.out.println("是否单例：" + monkey1 == monkey2);

        //拿到构建monkey的FactoryBean
        Object monkeyFactoryBean = app.getBean("&monkey");
        System.out.println(monkeyFactoryBean);

        String [] beanNames = app.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanNames)
                .replaceAll("\\[|\\]","")
                .replaceAll(", ","\n"));
    }

    @Test
    public void test02(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Cat cat = app.getBean(Cat.class);
        System.out.println(cat);
    }

    @Test
    public void test03(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Company company = app.getBean(Company.class);
        Member member = app.getBean(Member.class);
        System.out.println(company);
        System.out.println(member);
    }

    @Test
    public void test04(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        System.out.println("IOC创建完成");
        String [] beanNames = app.getBeanDefinitionNames();
        System.out.println(Arrays.toString(beanNames)
                .replaceAll("\\[|\\]","")
                .replaceAll(", ","\n"));
    }

    /**
     * BeanFactory 注入Bean
     */
    @Test
    public void test05(){
        ApplicationContext app = new AnnotationConfigApplicationContext(MyConfig.class);
        Monkey monkey = app.getBean(Monkey.class);
        Object factoryBean = app.getBean("&monkey");
        System.out.println(monkey);
        System.out.println(factoryBean);
    }

}
