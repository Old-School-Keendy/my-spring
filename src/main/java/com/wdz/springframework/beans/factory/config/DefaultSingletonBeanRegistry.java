package com.wdz.springframework.beans.factory.config;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.beans.factory.DisposableBean;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public class DefaultSingletonBeanRegistry implements SingletonBeanRegistry {
    private Map<String, Object> singletonObjects = new HashMap<>();

    private final Map<String, DisposableBean> disposableBeans = new HashMap<>();

    @Override
    public Object getSingleton(String beanName) {
        return singletonObjects.get(beanName);
    }

    @Override
    public void registerSingleton(String beanName, Object singletonObject) {
        singletonObjects.put(beanName, singletonObject);
    }

    @Override
    public void destroySingletons() {
        final Set<String> keySet = this.disposableBeans.keySet();
        final Object[] disposableBeanNames = keySet.toArray();
        for (int i = disposableBeanNames.length - 1; i >= 0; i--) {
            final Object beanName = disposableBeanNames[i];
            final DisposableBean disposableBean = disposableBeans.remove(beanName);
            try {
                disposableBean.destroy();
            } catch (Exception e) {
                throw new BeansException("Destroy method on bean with name '" + beanName + "' threw an exception", e);
            }
        }
    }

    public void registerDisposableBean(String beanName, DisposableBean bean) {
        disposableBeans.put(beanName, bean);
    }
}
