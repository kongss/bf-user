package com.bf.slow.api.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bf.slow.Slow;
import com.bf.slow.api.SlowApi;
import com.bf.slow.dao.SlowMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

/**
 * xx
 *
 * @author kongshuaishuai
 * Created on 2019/5/20 12:48
 * Email is kongshuaishuai@mrfresh.com
 * Copyright is 北京滴哩网络科技有限公司
 */
@Slf4j
@Service
public class SlowImpl extends ServiceImpl<SlowMapper, Slow> implements SlowApi {
    @Override
    public boolean add(Slow slow) {
        log.info("保存slow:{}",slow);
        return this.save(slow);
    }
}
