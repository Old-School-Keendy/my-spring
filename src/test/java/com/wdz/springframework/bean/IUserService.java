package com.wdz.springframework.bean;

/**
 * @author wangdezhao
 * @date 2023/2/27
 * @description
 */
public interface IUserService {

    String queryUserInfo();

    String register(String userName);
}