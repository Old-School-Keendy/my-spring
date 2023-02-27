package com.wdz.springframework.aop.framework.autoproxy;

import java.util.Collection;

import com.wdz.springframework.aop.AdvisedSupport;
import com.wdz.springframework.aop.Advisor;
import com.wdz.springframework.aop.ClassFilter;
import com.wdz.springframework.aop.Pointcut;
import com.wdz.springframework.aop.TargetSource;
import com.wdz.springframework.aop.aspectj.AspectJExpressionPointcutAdvisor;
import com.wdz.springframework.aop.framework.ProxyFactory;
import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.beans.factory.BeanFactory;
import com.wdz.springframework.beans.factory.BeanFactoryAware;
import com.wdz.springframework.beans.factory.config.InstantiationAwareBeanPostProcessor;
import com.wdz.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;

/**
 * @author wangdezhao
 * @date 2023/2/27
 * @description
 */
public class DefaultAdvisorAutoProxyCreator implements InstantiationAwareBeanPostProcessor,BeanFactoryAware {

    private DefaultListableBeanFactory beanFactory;

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = (DefaultListableBeanFactory)beanFactory;
    }

    @Override
    public Object postProcessBeforeInstantiation(Class<?> beanClass, String beanName) throws BeansException {

        if (isInfrastructureClass(beanClass)) {
            return null;
        }

        Collection<AspectJExpressionPointcutAdvisor> advisors = beanFactory.getBeansOfType(AspectJExpressionPointcutAdvisor.class).values();

        for (AspectJExpressionPointcutAdvisor advisor : advisors) {
            ClassFilter classFilter = advisor.getPointcut().getClassFilter();
            if (!classFilter.matches(beanClass)) {
                continue;
            }

            AdvisedSupport advisedSupport = new AdvisedSupport();

            TargetSource targetSource = null;
            try {
                targetSource = new TargetSource(beanClass.getDeclaredConstructor().newInstance());
            } catch (Exception e) {
                e.printStackTrace();
            }
            advisedSupport.setTargetSource(targetSource);
            advisedSupport.setMethodInterceptor((MethodInterceptor) advisor.getAdvice());
            advisedSupport.setMethodMatcher(advisor.getPointcut().getMethodMatcher());
            advisedSupport.setProxyTargetClass(false);

            return new ProxyFactory(advisedSupport).getProxy();

        }

        return null;
    }

    private boolean isInfrastructureClass(Class<?> beanClass) {
        return Advice.class.isAssignableFrom(beanClass) || Pointcut.class.isAssignableFrom(beanClass) || Advisor.class.isAssignableFrom(beanClass);
    }

    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        return bean;
    }
}
