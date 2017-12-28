package com.dubbo.dubboprovider.service;

import com.dubbo.dubboapi.service.ExampleService;
import org.springframework.stereotype.Component;

/**
 * Create by cai.chaoxiong on 2017/12/28 <br/>
 */
@Component
public class ExampleServiceImpl implements ExampleService {
    @Override
    public String send(String msg) {
        System.out.println(msg);
        return "{\"msg\":\"you say:" + msg+"\"}";
    }
}
