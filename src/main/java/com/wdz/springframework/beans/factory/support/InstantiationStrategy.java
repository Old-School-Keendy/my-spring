package com.wdz.springframework.beans.factory.support;

import java.lang.reflect.Constructor;

import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.beans.factory.config.BeanDefinition;

/**
 * @author by Wangdezhao
 * @date 2023/2/15 14:20 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public interface InstantiationStrategy {
    Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException;
}
