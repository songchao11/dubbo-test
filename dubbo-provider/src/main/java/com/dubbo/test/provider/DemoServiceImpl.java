package com.dubbo.test.provider;


/**
 * Created by song on 2018/6/7.
 */
public class DemoServiceImpl implements DemoService {
    public String sayHelloWorld(String name) {
        return "my name is "+name+",Hello!";
    }
}
