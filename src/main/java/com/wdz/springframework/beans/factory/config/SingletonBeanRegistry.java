package com.wdz.springframework.beans.factory.config;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public interface SingletonBeanRegistry {
    Object getSingleton(String beanName);

    void destroySingletons();

    void registerSingleton(String beanName, Object singletonObject);
}
