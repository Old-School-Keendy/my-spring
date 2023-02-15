package com.wdz.springframework.beans;

/**
 *  Bean 属性信息
 *
 * @author by Wangdezhao
 * @date 2023/2/15 15:06 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class PropertyValue {

    /** 属性名称 */
    private final String name;

    /** 属性值 */
    private final Object value;

    public PropertyValue(String name, Object value) {
        this.name = name;
        this.value = value;
    }

    public Object getValue() {
        return value;
    }

    public String getName() {
        return name;
    }

}
