package com.wdz.springframework.aop;

/**
 * @author wangdezhao
 * @date 2023/2/27
 * @description
 */
public interface PointCutAdvisor extends Advisor{
    Pointcut getPointcut();
}
