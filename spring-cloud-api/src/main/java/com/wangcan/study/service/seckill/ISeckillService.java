package com.wangcan.study.service.seckill;

import com.wangcan.study.pojo.bo.ExposerBO;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import static com.wangcan.study.service.FeignConstant.FEIGN_NAME;

/**
 * @autor wangcan
 * @date 2018/5/4 下午5:32
 **/
@FeignClient(FEIGN_NAME)
public interface ISeckillService {

    @RequestMapping(value = "{seckillGoodsId}/getSeckillUrl")
    ExposerBO exportSeckillUrl(@PathVariable("seckillGoodsId") Long seckillGoodsId);

    @RequestMapping(value = "executionSeckillId")
    Boolean executionSeckillId(@RequestParam("seckillGoodsId") Long seckillID,@RequestParam("md5") String md5);
}
