package com.wdz.springframework.common;

import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.beans.PropertyValue;
import com.wdz.springframework.beans.PropertyValues;
import com.wdz.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.wdz.springframework.beans.factory.config.BeanDefinition;
import com.wdz.springframework.beans.factory.config.BeanFactoryPostProcessor;

/**
 * @author wangdezhao
 * @date 2023/2/18
 * @description
 */
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor {

    @Override
    public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
        System.out.println("postProcessBeforeInitialization 方法执行!");
        //BeanDefinition beanDefinition = beanFactory.getBeanDefinition("userService");
        //PropertyValues propertyValues = beanDefinition.getPropertyValues();
        //
        //propertyValues.addPropertyValue(new PropertyValue("company", "改为：字节跳动"));
    }
}
