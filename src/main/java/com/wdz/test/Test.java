package com.wdz.test;

import com.wdz.springframework.beans.PropertyValue;
import com.wdz.springframework.beans.PropertyValues;
import com.wdz.springframework.beans.factory.config.BeanDefinition;
import com.wdz.springframework.beans.factory.config.BeanReference;
import com.wdz.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public class Test {
    public static void main(String[] args) {
        final DefaultListableBeanFactory beanFactory = new DefaultListableBeanFactory();
        beanFactory.registerBeanDefinition("userDao",new BeanDefinition(UserDao.class));

        PropertyValues propertyValues = new PropertyValues();
        propertyValues.addPropertyValue(new PropertyValue("uId","1001"));
        propertyValues.addPropertyValue(new PropertyValue("userDao", new BeanReference("userDao")));

        // 4. UserService 注入bean
        BeanDefinition beanDefinition = new BeanDefinition(UserService.class, propertyValues);
        beanFactory.registerBeanDefinition("userService", beanDefinition);

        final UserService userService = (UserService)beanFactory.getBean("userService");
        userService.queryUserInfo();
    }
}
