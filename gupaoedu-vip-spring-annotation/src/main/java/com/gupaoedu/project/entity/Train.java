package com.gupaoedu.project.entity;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

/**
 * Created by Tom.
 */
@Component
@Lazy
public class Train implements InitializingBean,DisposableBean {

    public Train() {
        System.out.println("Train得构造方法实现了....");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("火车对象销毁");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("火车对象初始化");
    }
}
