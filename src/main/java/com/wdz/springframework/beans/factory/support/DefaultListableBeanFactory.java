package com.wdz.springframework.beans.factory.support;

import java.util.HashMap;
import java.util.Map;

import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.beans.factory.config.BeanDefinition;

/**
 * 维护一个beanDefinition的map,用于获取beanDefinition的注册和定义
 *
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public class DefaultListableBeanFactory extends AbstractAutowireCapableBeanFactory implements BeanDefinitionRegistry {
    private final Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    @Override
    protected BeanDefinition getBeanDefinition(String beanName) {
        BeanDefinition beanDefinition = beanDefinitionMap.get(beanName);
        if (beanDefinition == null) {
            throw new BeansException("No bean named '" + beanName + "' is defined");
        }
        return beanDefinition;
    }

    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }
}
