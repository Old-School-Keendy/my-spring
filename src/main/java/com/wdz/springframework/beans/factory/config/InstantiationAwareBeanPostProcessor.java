package com.wdz.springframework.beans.factory.config;

import com.wdz.springframework.beans.BeansException;

/**
 * @author wangdezhao
 * @date 2023/2/27
 * @description
 */
public interface InstantiationAwareBeanPostProcessor extends BeanPostProcessor{

    Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException;

    @Override
    Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException;
}
