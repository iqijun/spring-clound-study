package com.fullstacker.eurekaconsume.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="spring-cloud-producer")
@Service
public interface HelloService {

    @RequestMapping(value = "hello")
    String hello(@RequestParam("name") String name);
}
