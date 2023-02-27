package com.wdz.springframework.context;

import com.wdz.springframework.context.event.ApplicationEvent;

/**
 * @author wangdezhao
 * @date 2023/2/24
 * @description
 */
public interface ApplicationEventPublisher {
    /**
     * Notify all listeners registered with this application of an application
     * event. Events may be framework events (such as RequestHandledEvent)
     * or application-specific events.
     * @param event the event to publish
     */
    void publishEvent(ApplicationEvent event);
}
