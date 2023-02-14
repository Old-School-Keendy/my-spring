package com.wdz.springframework.beans.factory.config;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public class BeanDefinition {
    private Class beanClass;

    public BeanDefinition(Class beanClazz) {
        this.beanClass = beanClazz;
    }

    public Class getBeanClass() {
        return beanClass;
    }

    public void setBeanClass(Class beanClass) {
        this.beanClass = beanClass;
    }
}