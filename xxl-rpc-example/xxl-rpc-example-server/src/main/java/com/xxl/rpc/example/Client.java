package com.xxl.rpc.example;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author yufenghui
 * </p>
 * 日期：2018/6/1 14:51
 * </p>
 * 描述：
 */
public class Client {

    public static void main(String[] args) {
        new ClassPathXmlApplicationContext("applicationcontext-rpc-provider.xml");
    }

}