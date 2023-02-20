package com.wdz.springframework.beans.factory.support;

import java.lang.reflect.Method;

import cn.hutool.core.util.StrUtil;
import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.beans.factory.DisposableBean;
import com.wdz.springframework.beans.factory.config.BeanDefinition;

/**
 * @author by Wangdezhao
 * @date 2023/2/20 14:42 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class DisposableBeanAdapter implements DisposableBean {

    private final Object bean;
    private final String beanName;
    private String destroyMethodName;


    public DisposableBeanAdapter(Object bean, String beanName, BeanDefinition beanDefinition) {
        this.bean = bean;
        this.beanName = beanName;
        this.destroyMethodName = beanDefinition.getDestroyMethodName();
    }


    @Override
    public void destroy() throws Exception {
        // 1. 实现接口 DisposableBean
        if (bean instanceof DisposableBean) {
            ((DisposableBean) bean).destroy();
        }

        // 2. 注解配置 destroy-method {判断是为了避免二次执行销毁}
        if (StrUtil.isNotEmpty(destroyMethodName) && !(bean instanceof DisposableBean && "destroy".equals(this.destroyMethodName))) {
            Method destroyMethod = bean.getClass().getMethod(destroyMethodName);
            if (null == destroyMethod) {
                throw new BeansException("Couldn't find a destroy method named '" + destroyMethodName + "' on bean with name '" + beanName + "'");
            }
            destroyMethod.invoke(bean);
        }

    }
}
