package com.wdz.springframework.aop.aspectj;

import com.wdz.springframework.aop.Pointcut;
import com.wdz.springframework.aop.PointCutAdvisor;
import org.aopalliance.aop.Advice;

/**
 * @author wangdezhao
 * @date 2023/2/27
 * @description
 */
public class AspectJExpressionPointcutAdvisor implements PointCutAdvisor {

    // 切面
    private AspectJExpressionPointcut pointcut;
    // 具体的拦截方法
    private Advice advice;
    // 表达式
    private String expression;

    public void setExpression(String expression){
        this.expression = expression;
    }

    public void setAdvice(Advice advice){
        this.advice = advice;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }

    @Override
    public Pointcut getPointcut() {
        if (null == pointcut) {
            pointcut = new AspectJExpressionPointcut(expression);
        }
        return pointcut;
    }
}
