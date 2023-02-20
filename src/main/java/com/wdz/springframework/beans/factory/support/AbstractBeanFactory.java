package com.wdz.springframework.beans.factory.support;

import java.util.ArrayList;
import java.util.List;

import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.beans.factory.BeanFactory;
import com.wdz.springframework.beans.factory.config.BeanDefinition;
import com.wdz.springframework.beans.factory.config.BeanPostProcessor;
import com.wdz.springframework.beans.factory.config.ConfigurableBeanFactory;
import com.wdz.springframework.beans.factory.config.DefaultSingletonBeanRegistry;
import com.wdz.springframework.utils.ClassUtils;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public abstract class AbstractBeanFactory extends DefaultSingletonBeanRegistry implements ConfigurableBeanFactory {

    /** ClassLoader to resolve bean class names with, if necessary */
    private ClassLoader beanClassLoader = ClassUtils.getDefaultClassLoader();

    /** BeanPostProcessors to apply in createBean */
    private final List<BeanPostProcessor> beanPostProcessors = new ArrayList<BeanPostProcessor>();

    /**
     * 获得单例bean,如果不存在就创建单例bean,通过模板模式由子类实现
     *
     * @param beanName bean名称
     * @return bean对象
     */
    @Override
    public Object getBean(String beanName) {
        return doGetBean(beanName, null);
    }

    @Override
    public Object getBean(String beanName, Object... args) throws BeansException {
        return doGetBean(beanName, args);
    }

    @Override
    public <T> T getBean(String name, Class<T> requiredType) throws BeansException {
        return (T) getBean(name);
    }

    private <T> T doGetBean(String beanName, Object[] args) {
        // todo
        Object bean = getSingleton(beanName);
        if (bean != null) {
            return (T)bean;
        }
        final BeanDefinition beanDefinition = getBeanDefinition(beanName);
        return (T)createBean(beanName, beanDefinition, args);
    }

    protected abstract Object createBean(String beanName, BeanDefinition beanDefinition, Object[] args);

    protected abstract BeanDefinition getBeanDefinition(String beanName);

    @Override
    public void addBeanPostProcessor(BeanPostProcessor beanPostProcessor){
        this.beanPostProcessors.remove(beanPostProcessor);
        this.beanPostProcessors.add(beanPostProcessor);
    }

    public List<BeanPostProcessor> getBeanPostProcessors() {
        return beanPostProcessors;
    }

    public ClassLoader getBeanClassLoader() {
        return this.beanClassLoader;
    }
}
