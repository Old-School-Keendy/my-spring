package com.wdz.springframework.beans.factory.config;

import com.wdz.springframework.beans.PropertyValues;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public class BeanDefinition {
    private Class beanClass;
    private PropertyValues propertyValues;

    public BeanDefinition(Class beanClass) {
        this.beanClass = beanClass;
        this.propertyValues = new PropertyValues();
    }

    public PropertyValues getPropertyValues() {
        return propertyValues;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public BeanDefinition(Class beanClass, PropertyValues propertyValues) {
        this.beanClass = beanClass;
        this.propertyValues = propertyValues;
    }
}