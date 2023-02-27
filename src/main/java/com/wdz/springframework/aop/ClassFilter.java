package com.wdz.springframework.aop;

/**
 * @author wangdezhao
 * @date 2023/2/27
 * @description: 定义类匹配类，用于切点找到给定的接口和目标类。
 */
public interface ClassFilter {
    boolean matches(Class<?> clazz);
}
