package com.wdz.demo;

import lombok.Data;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */

@Data
public class User{
    private String name;
    private int age;

    public void print(){
        System.out.println("name: " + name);
        System.out.println("age: " + age);
    }
}
