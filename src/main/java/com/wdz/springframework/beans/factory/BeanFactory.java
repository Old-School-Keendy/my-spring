package com.wdz.springframework.beans.factory;

import com.wdz.springframework.beans.BeansException;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public interface BeanFactory {
    Object getBean(String beanName);

    Object getBean(String name, Object... args) throws BeansException;

    /**
     * 返回指定泛型的对象
     * @param name  要检索的bean的名称
     * @param requiredType 类型
     * @param <T>          泛型
     * @return             实例化的 Bean 对象
     * @throws BeansException 不能获取 Bean 对象，则抛出异常
     */
     <T> T getBean(String name, Class<T> requiredType) throws BeansException;

}
