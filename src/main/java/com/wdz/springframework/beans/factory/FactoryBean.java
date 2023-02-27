package com.wdz.springframework.beans.factory;

/**
 * @author wangdezhao
 * @date 2023/2/23
 * @description
 */
public interface FactoryBean<T> {

    T getObject() throws Exception;

    Class<?> getObjectType();

    boolean isSingleton();
}
