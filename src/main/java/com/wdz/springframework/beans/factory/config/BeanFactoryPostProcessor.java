package com.wdz.springframework.beans.factory.config;

import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.beans.factory.ConfigurableListableBeanFactory;

/**
 * @author wangdezhao
 * @date 2023/2/18
 * @description
 */
public interface BeanFactoryPostProcessor {
    /**
     * 在所有的 BeanDefinition 加载完成后，实例化 Bean 对象之前，提供修改 BeanDefinition 属性的机制
     *
     * @param beanFactory
     * @throws BeansException
     */
    void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException;
}
