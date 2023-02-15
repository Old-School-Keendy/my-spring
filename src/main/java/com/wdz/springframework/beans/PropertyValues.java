package com.wdz.springframework.beans;

import java.util.ArrayList;
import java.util.List;

/**
 * @author by Wangdezhao
 * @date 2023/2/15 15:08 Copyright 2021 北京交个朋友数码科技有限公司. All rights reserved.
 */
public class PropertyValues {
    private final List<PropertyValue> propertyValueList = new ArrayList<>();

    public void addPropertyValue(PropertyValue pv) {
        this.propertyValueList.add(pv);
    }

    public PropertyValue[] getPropertyValues() {
        return this.propertyValueList.toArray(new PropertyValue[0]);
    }

    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue pv : this.propertyValueList) {
            if (pv.getName().equals(propertyName)) {
                return pv;
            }
        }
        return null;
    }
}
