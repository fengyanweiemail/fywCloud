package com.fyw.service.impl;

import com.fyw.service.FeignService;
import org.springframework.stereotype.Component;

import java.util.Map;

/**
 * Created by fyw on 2019/8/2.
 */
@Component
public class FeignServiceImpl implements FeignService {
    @Override
    public Map findAll() {
        return null;
    }

    @Override
    public String index() {
        return "服务出错的降级处理结果。。。。。";
    }
}
