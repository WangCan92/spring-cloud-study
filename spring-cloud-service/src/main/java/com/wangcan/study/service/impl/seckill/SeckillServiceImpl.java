package com.wangcan.study.service.impl.seckill;

import com.wangcan.study.pojo.bo.ExposerBO;
import com.wangcan.study.service.seckill.ISeckillService;
import org.springframework.util.DigestUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @autor wangcan
 * @date 2018/5/4 下午5:39
 **/
@RestController
public class SeckillServiceImpl implements ISeckillService {

    private final String salt = "qwerwterwt";

    @Override
    public ExposerBO exportSeckillUrl(Long seckillGoodsId) {
        //首页根据该seckillGoodsId判断商品是否还存在。
        //如果不存在则表示已经被秒杀
        String md5 = getMD5(seckillGoodsId);
        ExposerBO exposerBO = new ExposerBO();
        exposerBO.setMd5(md5);
        return exposerBO;
    }

    private String getMD5(Long seckillGoodsId) {
        //结合秒杀的商品id与混淆字符串生成通过md5加密
        String base = seckillGoodsId + "/" + salt;
        String md5 = DigestUtils.md5DigestAsHex(base.getBytes());
        return md5;
    }

    @Override
    public Boolean executionSeckillId(Long seckillID, String md5) {
        if (md5 == null || !md5.equals(getMD5(seckillID))) {
            //表示接口错误，不会执行秒杀操作
            return false;
        }
        //接口正确，排队执行秒杀操作。减库存+增加购买明细等信息，这里只返回false
        return true;
    }

}
