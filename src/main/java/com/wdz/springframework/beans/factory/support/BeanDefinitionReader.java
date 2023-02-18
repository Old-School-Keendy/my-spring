package com.wdz.springframework.beans.factory.support;

import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.core.io.Resource;
import com.wdz.springframework.core.io.ResourceLoader;

/**
 *
 * 这里需要注意 getRegistry()、getResourceLoader()，都是用于提供给后面三个方法的工具，加载和注册，这两个方法的实现会包装到抽象类中，以免污染具体的接口实现方法。
 * @author by Wangdezhao
 * @date 2023/2/17 10:37 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public interface BeanDefinitionReader {

    BeanDefinitionRegistry getRegistry();

    ResourceLoader getResourceLoader();

    void loadBeanDefinitions(Resource resource) throws BeansException;

    void loadBeanDefinitions(Resource... resources) throws BeansException;

    void loadBeanDefinitions(String location) throws BeansException;

    void loadBeanDefinitions(String... locations) throws BeansException;
}
