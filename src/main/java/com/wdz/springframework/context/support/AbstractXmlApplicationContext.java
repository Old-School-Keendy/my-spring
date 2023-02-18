package com.wdz.springframework.context.support;

import java.util.ArrayList;
import java.util.List;

import com.wdz.springframework.beans.factory.support.DefaultListableBeanFactory;
import com.wdz.springframework.beans.factory.xml.XmlBeanDefinitionReader;

/**
 * @author wangdezhao
 * @date 2023/2/18
 * @description
 */
public abstract class AbstractXmlApplicationContext extends AbstractRefreshableApplicationContext {

    @Override
    protected void loadBeanDefinitions(DefaultListableBeanFactory beanFactory) {
        XmlBeanDefinitionReader beanDefinitionReader = new XmlBeanDefinitionReader(beanFactory, this);
        String[] configLocations = getConfigLocations();
        if (null != configLocations) {
            beanDefinitionReader.loadBeanDefinitions(configLocations);
        }

    }

    protected abstract String[] getConfigLocations();
}
