package com.wdz.springframework;

import com.wdz.springframework.bean.UserService;
import com.wdz.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.wdz.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import com.wdz.springframework.common.MyBeanFactoryPostProcessor;
import com.wdz.springframework.common.MyBeanPostProcessor;
import com.wdz.springframework.context.support.ClassPathXmlApplicationContext;
import com.wdz.springframework.core.io.DefaultResourceLoader;
import org.junit.Before;
import org.junit.jupiter.api.Test;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 *
 * @description 测试类
 * @date 2022/03/07
 */
public class ApiTest {

    private DefaultResourceLoader resourceLoader;

    @Before
    public void init() {
        resourceLoader = new DefaultResourceLoader();
    }

    @Test
    public void test_xml() {
        // 1.初始化 BeanFactory
        ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:spring.xml");
        applicationContext.registerShutdownHook();

        // 2. 获取Bean对象调用方法
        UserService userService = applicationContext.getBean("userService", UserService.class);
        String result = userService.queryUserInfo();
        System.out.println("测试结果：" + result);
    }

    @Test
    public void test_hook() {
        Runtime.getRuntime().addShutdownHook(new Thread(()-> System.out.println("close! ")));
    }

}
