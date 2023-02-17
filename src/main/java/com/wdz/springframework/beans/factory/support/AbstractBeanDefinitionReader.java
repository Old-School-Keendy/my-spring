package com.wdz.springframework.beans.factory.support;

import com.wdz.springframework.core.io.DefaultResourceLoader;
import com.wdz.springframework.core.io.ResourceLoader;

/**
 * @author by Wangdezhao
 * @date 2023/2/17 10:41 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 *
 * 接口实现:
 * 一. 抽象类继承/实现接口
 * 抽象类可以实现多个接口，但是抽象类不能继承接口，同时在抽象类中，不用重写接口的方法，没有意义。
 *
 * 二. 接口继承/实现接口
 * 接口不可以实现接口，但是接口可以继承多个接口。
 *
 * 三. 接口继承/实现抽象类
 * 接口只可以继承接口，不能实现接口，接口不可以继承抽象类。
 *
 * 抽象类继承:
 * 1. 抽象类继承普通类的属性和方法
 * 2. 具体类继承抽象类, 要重写抽象类的抽象方法
 * 3. 抽象类继承抽象类, 可以重写也可以选择不重写其中的抽象方法
 */

public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {

    private final BeanDefinitionRegistry registry;

    private final ResourceLoader resourceLoader;

    protected AbstractBeanDefinitionReader(BeanDefinitionRegistry registry) {
        this(registry, new DefaultResourceLoader());
    }

    public AbstractBeanDefinitionReader(BeanDefinitionRegistry registry, ResourceLoader resourceLoader) {
        this.registry = registry;
        this.resourceLoader = resourceLoader;
    }

    @Override
    public BeanDefinitionRegistry getRegistry() {
        return registry;
    }

    @Override
    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
