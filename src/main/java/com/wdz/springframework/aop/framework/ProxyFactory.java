package com.wdz.springframework.aop.framework;

import com.wdz.springframework.aop.AdvisedSupport;
import com.wdz.springframework.aop.framework.AopProxy;
import com.wdz.springframework.aop.framework.Cglib2AopProxy;
import com.wdz.springframework.aop.framework.JdkDynamicAopProxy;

/**
 * @author wangdezhao
 * @date 2023/2/27
 * @description
 */
public class ProxyFactory {
    private AdvisedSupport advisedSupport;

    public ProxyFactory(AdvisedSupport advisedSupport) {
        this.advisedSupport = advisedSupport;
    }

    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    private AopProxy createAopProxy() {
        if (advisedSupport.isProxyTargetClass()) {
            return new Cglib2AopProxy(advisedSupport);
        }

        return new JdkDynamicAopProxy(advisedSupport);
    }
}
