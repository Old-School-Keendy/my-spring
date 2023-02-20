package com.wdz.springframework.beans.factory;

import com.wdz.springframework.beans.BeansException;

/**
 * @author by Wangdezhao
 * @date 2023/2/20 16:34 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public interface BeanFactoryAware extends Aware {
    void setBeanFactory(BeanFactory beanFactory) throws BeansException;
}
