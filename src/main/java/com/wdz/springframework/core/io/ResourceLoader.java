package com.wdz.springframework.core.io;

/**
 * @author by Wangdezhao
 * @date 2023/2/17 10:21 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public interface ResourceLoader {
    /**
     * Pseudo URL prefix for loading from the class path: "classpath:"
     */
    String CLASSPATH_URL_PREFIX = "classpath:";

    Resource getResource(String location);
}
