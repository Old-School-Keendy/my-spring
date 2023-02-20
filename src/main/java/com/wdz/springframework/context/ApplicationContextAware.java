package com.wdz.springframework.context;

import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.beans.factory.Aware;

/**
 * @author by Wangdezhao
 * @date 2023/2/20 16:35 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public interface ApplicationContextAware extends Aware {
    void setApplicationContext(ApplicationContext applicationContext) throws BeansException;
}
