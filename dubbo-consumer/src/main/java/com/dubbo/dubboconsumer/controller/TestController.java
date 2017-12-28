package com.dubbo.dubboconsumer.controller;

import com.dubbo.dubboapi.service.ExampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Create by cai.chaoxiong on 2017/12/28 <br/>
 */

@RestController
@RequestMapping("test")
public class TestController {

    @Autowired
    @SuppressWarnings("ALL")
    private ExampleService exampleService;

    @RequestMapping("send")
    public String send(@RequestParam String msg){
       return exampleService.send(msg);
    }
}
