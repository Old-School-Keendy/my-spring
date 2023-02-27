package com.wdz.springframework.bean;

import java.lang.reflect.Method;

import com.wdz.springframework.aop.MethodBeforeAdvice;

/**
 * @author wangdezhao
 * @date 2023/2/27
 * @description
 */
public class UserServiceBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] args, Object target) throws Throwable {
        System.out.println("拦截方法：" + method.getName());
    }
}
