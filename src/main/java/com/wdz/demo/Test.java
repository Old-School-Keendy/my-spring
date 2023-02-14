package com.wdz.demo;

import com.sun.xml.internal.ws.model.AbstractWrapperBeanGenerator.BeanMemberFactory;
import lombok.Data;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public class Test {
    public static void main(String[] args) {
        BeanFactory beanFactory = new BeanFactory();
        BeanDefinition beanDefinition = new BeanDefinition(new User());
        beanFactory.registerBeanDefinition("User",beanDefinition);

        User user = (User)beanFactory.getBean("User");
        user.print();

    }


}
