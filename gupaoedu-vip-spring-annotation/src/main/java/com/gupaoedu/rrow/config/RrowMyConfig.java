package com.gupaoedu.rrow.config;

import com.gupaoedu.rrow.entity.MaoYuna;
import com.gupaoedu.rrow.entity.Mimi;
import com.gupaoedu.rrow.interfaces.User;
import com.mchange.v2.c3p0.ComboPooledDataSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;
import javax.sql.DataSource;

/**
 * @author: Rrow
 * @date: 2022/6/11 15:58
 */
@Configuration
@ComponentScan({
        "com.gupaoedu.rrow.weave",
        "com.gupaoedu.rrow.dao",
        "com.gupaoedu.rrow.service"
})
@EnableTransactionManagement            // 代表开启了事务，这里是声明式事务
public class RrowMyConfig {

    @Resource
    private User user;

    @Bean
    public User user() {
        MaoYuna maoYuna = new MaoYuna();
        maoYuna.setName("猫羽雫");
        return maoYuna;
    }

    @Primary
    @Bean
    public User user2() {
        Mimi mimi = new Mimi();
        mimi.setName("美美");
        return mimi;
    }


    //数据源
    @Bean
    public DataSource dataSource() throws Exception {
        ComboPooledDataSource dataSource = new ComboPooledDataSource();
        dataSource.setUser("test");
        dataSource.setPassword("test");
        dataSource.setDriverClass("com.mysql.jdbc.Driver");
        dataSource.setJdbcUrl("jdbc:mysql://ecs01:3306/test");
        return dataSource;
    }

    // 配置jdbcTemplate到Spring
    @Bean
    public JdbcTemplate jdbcTemplate() throws Exception {
        //Spring对@Configuration类会特殊处理；给容器中加组件的方法，多次调用都只是从容器中找组件
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource());
        return jdbcTemplate;
    }

    //注册事务管理器在容器中
    @Bean
    public PlatformTransactionManager transactionManager() throws Exception {
        return new DataSourceTransactionManager(dataSource());
    }
}
