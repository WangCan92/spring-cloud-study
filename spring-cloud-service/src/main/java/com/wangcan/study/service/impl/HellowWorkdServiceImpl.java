package com.wangcan.study.service.impl;

import com.wangcan.study.service.IHellowWorldService;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autor wangcan
 * @date 2018/5/3 下午6:51
 **/
@RestController
public class HellowWorkdServiceImpl implements IHellowWorldService {
    @Override
    public String sayHiFromClientOne(String name) {
        return "你好，"+name;
    }
}
