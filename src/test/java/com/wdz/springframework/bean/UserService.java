package com.wdz.springframework.bean;

import com.wdz.springframework.beans.BeansException;
import com.wdz.springframework.beans.factory.BeanClassLoaderAware;
import com.wdz.springframework.beans.factory.BeanFactory;
import com.wdz.springframework.beans.factory.BeanFactoryAware;
import com.wdz.springframework.beans.factory.BeanNameAware;
import com.wdz.springframework.beans.factory.DisposableBean;
import com.wdz.springframework.beans.factory.InitializingBean;
import com.wdz.springframework.context.ApplicationContext;
import com.wdz.springframework.context.ApplicationContextAware;

/**
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 *
 * @description 模拟用户服务类
 * @date 2022/03/09
 */
public class UserService implements InitializingBean, DisposableBean, BeanNameAware, BeanClassLoaderAware, ApplicationContextAware, BeanFactoryAware {
    private ApplicationContext applicationContext;
    private BeanFactory beanFactory;


    private String uId;
    private String company;
    private String location;
    private UserDao userDao;

    @Override
    public void destroy() throws Exception {
        System.out.println("执行：UserService.destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("执行：UserService.afterPropertiesSet");
    }

    public String queryUserInfo() {
        return userDao.queryUserName(uId) + ", 公司：" + company + ", 地点" + location;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void setBeanClassLoader(ClassLoader classLoader) {
        System.out.println("classLoader: " + classLoader);
    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
this.beanFactory = beanFactory;
    }

    @Override
    public void setBeanName(String name) {
        System.out.println("beanName: " + name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }

    public ApplicationContext getApplicationContext() {
        return applicationContext;
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

}
