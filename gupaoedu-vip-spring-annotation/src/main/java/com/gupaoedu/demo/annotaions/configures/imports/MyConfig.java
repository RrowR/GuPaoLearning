package com.gupaoedu.demo.annotaions.configures.imports;

import com.gupaoedu.project.entity.Cat;
import com.gupaoedu.project.entity.Company;
import com.gupaoedu.project.entity.Member;
import com.gupaoedu.project.entity.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by Tom.
 */
@Configuration
// @Import(value = {Cat.class})
// @Import(value = {MyImportSelector.class})
@Import(value = {MyImportSelector.class,MyImportBeanDefinitionRegistrar.class})
public class MyConfig {

    @Bean
    public Company company(){
        return new Company();
    }

    @Bean
    public Member member(){
        return new Member();
    }

    //给IoC中注册Bean的方式
    //1、@Bean 直接导入单个类
    //2、@ComponentScan 包扫描默认是扫描（@Controller、@Service、@Repository、@Component）
    //3、@Import 快速给容器导入组件Bean
    //      a. @Import 直接传参导入
    //      b. ImportSelector 自定义导入规则
    //      c.ImportBeanDefinitionRegistrar ,使用BeanDefinitionRegistry可以手动注入到IoC容器中
    //4、FactoryBean 把需要注入的对象封装为FactoryBean
    //      a、FactoryBean 负责将Bean注入到容器的Bean
    //      b、BeanFactory 从IoC中获得Bean对象
    @Bean
    public Person person(){
        return new Person("Tom",18);
    }

    @Bean
    public MyFactoryBean monkey(){
        return new MyFactoryBean();
    }
}
