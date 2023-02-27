package com.wdz.springframework.event;

import com.wdz.springframework.context.event.ApplicationEvent;
import com.wdz.springframework.context.event.ApplicationListener;
import com.wdz.springframework.context.event.ContextRefreshedEvent;

/**
 * @author wangdezhao
 * @date 2023/2/24
 * @description
 */
public class ContextRefreshedEventListener implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        System.out.println("容器刷新: " + this.getClass().getName());
    }
}
