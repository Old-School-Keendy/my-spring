package com.wdz.springframework.event;

import java.util.Date;

import com.wdz.springframework.context.event.ApplicationListener;

/**
 * @author wangdezhao
 * @date 2023/2/24
 * @description
 */
public class CustomEventListener implements ApplicationListener<CustomEvent> {
    @Override
    public void onApplicationEvent(CustomEvent event) {
        System.out.println("CustomerEventListener监听到客户信息变化");
        System.out.println("收到：" + event.getSource() + "消息;时间：" + new Date());
        System.out.println("消息：" + event.getId() + ":" + event.getMessage());
    }
}
