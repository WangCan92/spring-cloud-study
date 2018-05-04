package com.wangcan.study.service.hellow;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import static com.wangcan.study.service.FeignConstant.FEIGN_NAME;

/**
 * @autor wangcan
 * @date 2018/5/3 下午6:01
 **/
@FeignClient(FEIGN_NAME)
public interface IHellowWorldService {

    @RequestMapping(value = "/hi",method = RequestMethod.GET)
    String sayHiFromClientOne(@RequestParam(value = "name") String name);

}
