package com.wdz.demo;

import lombok.Data;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
@Data
public class BeanDefinition {
    private Object bean;

    public BeanDefinition(Object o) {
        this.bean = o;
    }
}
