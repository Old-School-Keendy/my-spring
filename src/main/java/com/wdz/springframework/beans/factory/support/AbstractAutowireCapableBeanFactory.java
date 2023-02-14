package com.wdz.springframework.beans.factory.support;

import com.wdz.springframework.beans.factory.config.BeanDefinition;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public abstract class AbstractAutowireCapableBeanFactory extends AbstractBeanFactory {
    /**
     * 通过反射,创建单例bean,并将其注册到单例bean容器中
     * @param beanName bean名称
     * @param beanDefinition bean定义
     * @return 单例bean
     */
    @Override
    protected Object createBean(String beanName, BeanDefinition beanDefinition) {
        Object bean = null;
        try {
            bean = beanDefinition.getBeanClass().newInstance();
        } catch (InstantiationException | IllegalAccessException e) {
            e.printStackTrace();
        }
        addSingleton(beanName, bean);
        return bean;
    }

}
