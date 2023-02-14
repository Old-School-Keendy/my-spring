package com.wdz.springframework.beans.factory.support;

import com.wdz.springframework.beans.factory.config.BeanDefinition;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public interface BeanDefinitionRegistry {
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);
}
