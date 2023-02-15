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
}
