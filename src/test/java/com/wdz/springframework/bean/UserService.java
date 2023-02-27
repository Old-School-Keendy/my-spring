package com.wdz.springframework.bean;

import java.util.Random;

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
public class UserService implements IUserService {

    public String queryUserInfo() {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "小傅哥，100001，深圳";
    }

    public String register(String userName) {
        try {
            Thread.sleep(new Random(1).nextInt(100));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "注册用户：" + userName + " success！";
    }

}
