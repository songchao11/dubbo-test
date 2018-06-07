package com.dubbo.test.consumer;

import com.alibaba.fastjson.JSONObject;
import com.dubbo.test.provider.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by song on 2018/6/7.
 */
@RestController
public class TestController {

    @Autowired
    private DemoService demoService;

    @RequestMapping(value = "/test/{name}")
    public JSONObject test(@PathVariable String name){
        JSONObject jsonObject = new JSONObject();
        String result = demoService.sayHelloWorld(name);
        jsonObject.put("result", result);
        return jsonObject;
    }

}
