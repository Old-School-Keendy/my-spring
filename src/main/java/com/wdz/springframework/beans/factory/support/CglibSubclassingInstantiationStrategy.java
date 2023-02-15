package com.wdz.springframework.beans.factory.support;

import java.lang.reflect.Constructor;

import net.sf.cglib.proxy.Enhancer;
import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.beans.factory.config.BeanDefinition;
import net.sf.cglib.proxy.NoOp;

/**
 * @author by Wangdezhao
 * @date 2023/2/15 14:32 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class CglibSubclassingInstantiationStrategy implements InstantiationStrategy {
    @Override
    public Object instantiate(BeanDefinition beanDefinition, String beanName, Constructor ctor, Object[] args) throws BeansException {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(beanDefinition.getBeanClass());
        enhancer.setCallback(new NoOp() {});
        if (null == ctor) {
            return enhancer.create();
        }
        return enhancer.create(ctor.getParameterTypes(), args);
    }
}
