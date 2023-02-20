package com.wdz.springframework.beans.factory.config;
import com.wdz.springframework.beans.factory.HierarchicalBeanFactory;
import com.wdz.springframework.beans.factory.ListableBeanFactory;

/**
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * @description Configuration interface to be implemented by most bean factories. Provides
 * facilities to configure a bean factory, in addition to the bean factory
 * client methods in the {@link com.wdz.springframework.beans.factory.BeanFactory}
 * interface.
 * @date 2022/3/9
 *
 *
 */
public interface ConfigurableBeanFactory extends ListableBeanFactory, HierarchicalBeanFactory, SingletonBeanRegistry {

    String SCOPE_SINGLETON = "singleton";

    String SCOPE_PROTOTYPE = "prototype";

    void addBeanPostProcessor(BeanPostProcessor beanPostProcessor);

    void destroySingletons();

}
