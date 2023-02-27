package com.wdz.springframework.aop.framework.adapter;

import com.sun.xml.internal.ws.org.objectweb.asm.MethodAdapter;
import com.wdz.springframework.aop.MethodBeforeAdvice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * @author wangdezhao
 * @date 2023/2/27
 * @description
 */
public class MethodBeforeAdviceInterceptor implements MethodInterceptor {


    private MethodBeforeAdvice advice;

    public MethodBeforeAdviceInterceptor() {
    }

    public MethodBeforeAdviceInterceptor(MethodBeforeAdvice advice) {
        this.advice = advice;
    }

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        this.advice.before(methodInvocation.getMethod(), methodInvocation.getArguments(), methodInvocation.getThis());
        return methodInvocation.proceed();
    }
}
