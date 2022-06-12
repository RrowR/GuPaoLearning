package com.gupaoedu.rrow.weave;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.beans.factory.support.GenericBeanDefinition;
import org.springframework.stereotype.Component;

/**
 * @author: Rrow
 * @date: 2022/6/12 0:24
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor {
    @Override
    public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
        // BeanDefinition mimi = registry.getBeanDefinition("mimi");
        // System.out.println("找到mimi的 BeanDefinition移除成功");
        // registry.removeBeanDefinition("mimi");
        GenericBeanDefinition beanDefinition = new GenericBeanDefinition();
        // 自己创建一个BeanDefinition
        beanDefinition.setBeanClassName("com.gupaoedu.rrow.entity.Shuzuku");
        // 注册进去
        registry.registerBeanDefinition("shuZhuku",beanDefinition);
    }

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("============= BeanDefinitionRegistryPostProcessorTest invoke beanFactory =========");
    }
}
