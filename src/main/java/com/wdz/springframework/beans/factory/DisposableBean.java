package com.wdz.springframework.beans.factory;

/**
 * @author by Wangdezhao
 * @date 2023/2/20 13:46 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public interface DisposableBean {
    void destroy() throws Exception;
}
