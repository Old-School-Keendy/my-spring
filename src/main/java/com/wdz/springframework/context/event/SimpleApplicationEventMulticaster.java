package com.wdz.springframework.context.event;

import com.wdz.springframework.beans.factory.ConfigurableListableBeanFactory;
import com.wdz.springframework.context.event.AbstractApplicationEventMulticaster;
import com.wdz.springframework.context.event.ApplicationEvent;
import com.wdz.springframework.context.event.ApplicationEventMulticaster;
import com.wdz.springframework.context.event.ApplicationListener;

/**
 * @author wangdezhao
 * @date 2023/2/24
 * @description
 */
public class SimpleApplicationEventMulticaster extends AbstractApplicationEventMulticaster {

    public SimpleApplicationEventMulticaster(ConfigurableListableBeanFactory beanFactory) {
        setBeanFactory(beanFactory);
    }

    @Override
    public void multicastEvent(final ApplicationEvent event) {
        for (final ApplicationListener listener : getApplicationListeners(event)) {
            listener.onApplicationEvent(event);
        }
    }
}
