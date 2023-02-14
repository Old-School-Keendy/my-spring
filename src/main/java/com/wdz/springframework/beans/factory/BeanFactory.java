package com.wdz.springframework.beans.factory;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public interface BeanFactory {
    Object getBean(String beanName);
}
