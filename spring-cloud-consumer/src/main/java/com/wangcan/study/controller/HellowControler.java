package com.wangcan.study.controller;

import com.wangcan.study.service.IHellowWorldService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autor wangcan
 * @date 2018/5/4 上午9:59
 **/
@RestController
public class HellowControler {
    @Autowired
    private IHellowWorldService hellowWorldService;

    @RequestMapping("/sayHi")
    public String hi(String name){
        return hellowWorldService.sayHiFromClientOne(name);
    }
}
