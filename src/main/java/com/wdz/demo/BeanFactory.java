package com.wdz.demo;

import java.util.HashMap;
import java.util.Map;

import com.wdz.demo.BeanDefinition;
import lombok.Data;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
@Data
public class BeanFactory {
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();

    public Object getBean(String beanName){
        return beanDefinitionMap.get(beanName).getBean();
    }

    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition){
        beanDefinitionMap.put(beanName,beanDefinition);
    }
}
