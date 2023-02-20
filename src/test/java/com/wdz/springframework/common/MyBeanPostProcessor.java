package com.wdz.springframework.common;

import com.wdz.springframework.bean.UserService;
import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.beans.factory.config.BeanPostProcessor;

/**
 * @author wangdezhao
 * @date 2023/2/18
 * @description
 */
public class MyBeanPostProcessor implements BeanPostProcessor {


    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("beanName: " + beanName+ " postProcessBeforeInitialization 方法执行!");
        if ("userService".equals(beanName)) {
            UserService userService = (UserService) bean;
            userService.setLocation("改为：北京");
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("beanName: " + beanName+ " postProcessAfterInitialization 方法执行!");
        return bean;
    }
}
