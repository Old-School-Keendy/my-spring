package com.wdz.springframework.beans;

/**
 * @author wangdezhao
 * @date 2023/2/14
 * @description
 */
public class BeansException extends RuntimeException {

    public BeansException(String msg) {
        super(msg);
    }

    public BeansException(String msg, Throwable cause) {
        super(msg, cause);
    }

}