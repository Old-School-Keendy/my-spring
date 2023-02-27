package com.wdz.springframework.event;

import javax.xml.transform.Source;

import com.wdz.springframework.context.event.ApplicationEvent;
import com.wdz.springframework.context.event.ApplicationListener;
import com.wdz.springframework.context.event.ContextClosedEvent;
import com.wdz.springframework.context.event.ContextRefreshedEvent;

/**
 * @author wangdezhao
 * @date 2023/2/24
 * @description
 */
public class ContextClosedEventListener implements ApplicationListener<ContextClosedEvent> {

    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        System.out.println("容器关闭: " + this.getClass().getName());

    }
}
