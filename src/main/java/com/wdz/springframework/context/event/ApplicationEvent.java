package com.wdz.springframework.context.event;

import java.util.EventObject;

/**
 * @author wangdezhao
 * @date 2023/2/24
 * @description
 */
public class ApplicationEvent extends EventObject {
    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public ApplicationEvent(Object source) {
        super(source);
    }
}
