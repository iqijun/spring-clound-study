package com.fullstacker.eurekaconsume.controller;

import com.fullstacker.eurekaconsume.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eureka2
 * @description:
 * @author: xingguishuai
 * @create: 2019-10-04 21:39
 */
@RestController
public class ConsumerDemoController {

    @Autowired
    HelloService helloService;

    @RequestMapping("dispatchHello")
    @GetMapping
    public  String dispatchHello(String name){
        System.out.println("=======================================");
        String hello = helloService.hello(name);
        System.out.println("end  hello");
        return  hello;
    }

}
