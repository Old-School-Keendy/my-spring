package com.wdz.springframework.context.event;

import com.wdz.springframework.context.ApplicationContext;

/**
 * @author wangdezhao
 * @date 2023/2/24
 * @description
 */
public class ApplicationContextEvent extends ApplicationEvent {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationContextEvent(Object source) {
        super(source);
    }

    public final ApplicationContext getApplicationContext() {
        return (ApplicationContext)getSource();
    }
}
