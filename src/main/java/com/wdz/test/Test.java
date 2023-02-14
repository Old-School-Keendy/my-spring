package com.wdz.test;

import com.wdz.springframework.beans.factory.config.BeanDefinition;
import com.wdz.springframework.beans.factory.support.DefaultListableBeanFactory;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public class Test {
    public static void main(String[] args) {
        DefaultListableBeanFactory defaultListableBeanFactory = new DefaultListableBeanFactory();
        // 注册到beanDefinition容器中管理
        defaultListableBeanFactory.registerBeanDefinition("UseService",new BeanDefinition(UserService.class));

        /**
         * 第一次首先去单例容器里面去拿单例bean,如果为注册过返回null,此时会去拿维护的beanDefinition,如果还没有,就会报错获取单例bean失败
         * 获取beanDefinition成功后,回去createBean方法,具体由AbstractAutowireCapableBeanFactory方法实现,逻辑也很简单,
         * class类通过反射生成bean并且将其通过注册到单例容器中
         */
        UserService useServiceA = (UserService)defaultListableBeanFactory.getBean("UseService");
        String result = useServiceA.queryById(10L);
        System.out.println(result);

        /**
         * 第二次直接从维护的单例map中取出注册过的bean直接返回
         */
        UserService useServiceB = (UserService)defaultListableBeanFactory.getBean("UseService");
        String queryB = useServiceB.queryById(20L);
        System.out.println(queryB);
    }
}
