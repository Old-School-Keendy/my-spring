package com.wdz.springframework.context.event;

import java.util.EventListener;

/**
 * @author wangdezhao
 * @date 2023/2/24
 * @description
 */
public interface ApplicationListener<E extends ApplicationEvent> extends EventListener {

    /**
     * Handle an application event.
     * @param event the event to respond to
     */
    void onApplicationEvent(E event);

}
