package com.wdz.springframework.beans.factory.config;

/**
 * @author by Wangdezhao
 * @date 2023/2/15 16:00 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class BeanReference {

    private final String beanName;

    public BeanReference(String beanName) {
        this.beanName = beanName;
    }

    public String getBeanName() {
        return beanName;
    }
}
