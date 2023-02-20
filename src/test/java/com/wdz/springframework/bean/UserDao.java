package com.wdz.springframework.bean;

import java.util.HashMap;
import java.util.Map;

/**
 *
 *
 *
 * 作者：DerekYRC https://github.com/DerekYRC/mini-spring
 * @description 模拟用户DAO类
 * @date 2022/03/09
 *
 *
 */
public class UserDao {

    private static Map<String, String> hashMap = new HashMap<>();

    public void init(){
        System.out.println("执行：init-method");
        hashMap.put("10001", "剑圣");
        hashMap.put("10002", "主宰");
        hashMap.put("10003", "gugg");
    }

    public void destroy(){
        System.out.println("执行：destroy-method");
        hashMap.clear();
    }

    public String queryUserName(String uId) {
        return hashMap.get(uId);
    }

}
