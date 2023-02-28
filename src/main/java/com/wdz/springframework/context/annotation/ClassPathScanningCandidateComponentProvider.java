package com.wdz.springframework.context.annotation;

import java.util.LinkedHashSet;
import java.util.Set;

import cn.hutool.core.util.ClassUtil;
import com.wdz.springframework.beans.factory.config.BeanDefinition;
import com.wdz.springframework.stereotype.*;


/**
 * @author wangdezhao
 * @date 2023/2/28
 * @description
 */
public class ClassPathScanningCandidateComponentProvider {
    public Set<BeanDefinition> findCandidateComponents(String basePackage) {
        Set<BeanDefinition> candidates = new LinkedHashSet<>();
        Set<Class<?>> classes = ClassUtil.scanPackageByAnnotation(basePackage, Component.class);
        for (Class<?> clazz : classes) {
            candidates.add(new BeanDefinition(clazz));
        }
        return candidates;
    }
}
