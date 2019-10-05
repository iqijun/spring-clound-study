package com.fullstacker.eurekaproducer.hello;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: eureka2
 * @description: controller world
 * @author: xingguishuai
 * @create: 2019-10-04 20:33
 */

@RestController
public class HelloController {

    @RequestMapping("hello")
    public  String  hello(@RequestParam("name") String name){
        return "hello " + name;
    }
}
