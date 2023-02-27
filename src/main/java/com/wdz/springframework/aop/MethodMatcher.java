package com.wdz.springframework.aop;

import java.lang.reflect.Method;

/**
 * @author wangdezhao
 * @date 2023/2/27
 * @description: 方法匹配，找到表达式范围内匹配下的目标类和方法
 */
public interface MethodMatcher {
    boolean matches(Method method, Class<?> clazz);
}
