package com.wdz.springframework.beans.factory.support;

import com.wdz.springframework.beans.factory.BeanFactory;
import com.wdz.springframework.beans.factory.config.BeanDefinition;
import com.wdz.springframework.beans.factory.config.DefaultSingletonBeanRegistry;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements BeanFactory {
    /**
     * 获得单例bean,如果不存在就创建单例bean,通过模板模式由子类实现
     * @param beanName bean名称
     * @return bean对象
     */
    @Override
    public Object getBean(String beanName) {
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return bean;
        }

        BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return createBean(beanName,beanDefinition);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition);

    protected abstract BeanDefinition getBeanDefinition(String beanName);

}
