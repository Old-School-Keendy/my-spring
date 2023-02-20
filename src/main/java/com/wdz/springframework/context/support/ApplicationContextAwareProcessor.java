package com.wdz.springframework.context.support;

import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.beans.factory.config.BeanPostProcessor;
import com.wdz.springframework.context.ApplicationContext;
import com.wdz.springframework.context.ApplicationContextAware;

/**
 * @author by Wangdezhao
 * @date 2023/2/20 16:39 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class ApplicationContextAwareProcessor implements BeanPostProcessor {
    private final ApplicationContext applicationContext;

    public ApplicationContextAwareProcessor(ApplicationContext applicationContext) {this.applicationContext = applicationContext;}

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if (bean instanceof ApplicationContextAware) {
            ((ApplicationContextAware)bean).setApplicationContext(applicationContext);
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
