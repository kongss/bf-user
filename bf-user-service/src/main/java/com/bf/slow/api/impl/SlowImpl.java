package com.bf.slow.api.impl;

import com.alibaba.fastjson.JSON;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bf.slow.api.SlowApi;
import com.bf.slow.api.entity.Slow;
import com.bf.slow.common.Messenger;
import com.bf.slow.dao.SlowMapper;
import lombok.extern.slf4j.Slf4j;
import org.apache.dubbo.config.annotation.Service;

import java.util.List;
import java.util.UUID;

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
    public boolean add(Messenger messenger) {
        Slow slow = paramCheck(messenger);
        slow.setId(UUID.randomUUID().toString());
        log.info("保存slow信息:{}", slow);
        return this.save(slow);
    }

    @Override
    public boolean delete(Messenger messenger) {
        return this.removeById(messenger.getString("id"));
    }

    @Override
    public Messenger update(String id,Messenger messenger) {
        Slow slow = paramCheck(messenger);
        slow.setId(id);
        boolean update = this.updateById(slow);
        messenger.clear();
        messenger.setInfo("slow", slow);
        messenger.setInfo("flag", update);
        return messenger;
    }

    @Override
    public Messenger get(Messenger messenger) {
        Slow slow = this.getById(messenger.getString("id"));
        messenger.clear();
        messenger.setInfo("slow", slow);
        log.info("查询slow信息:{}", slow);
        return messenger;
    }

    @Override
    public Messenger page(Messenger messenger) {
        Page<Slow> pageParam = new Page<>();
        pageParam.setCurrent(1);
        pageParam.setSize(10);
        IPage<Slow> page = this.page(pageParam);
        messenger.setInfo("page", page);
        log.info("查询page信息:{}", page);
        return messenger;
    }

    @Override
    public Messenger list(Messenger messenger) {
        List<Slow> slowList = this.list();
        messenger.clear();
        messenger.setInfo("slowList", JSON.toJSON(slowList));
        log.info("查询slowList信息:{}", JSON.toJSON(slowList));
        return messenger;
    }

    Slow paramCheck(Messenger messenger){
        Slow slow = new Slow();
        slow.setId(messenger.getString("id"));
        slow.setTitle(messenger.getString("title"));
        slow.setSynopsis(messenger.getString("synopsis"));
        slow.setBeginTime(messenger.getString("beginTime"));
        slow.setEndTime(messenger.getString("endTime"));
        slow.setCode(messenger.getString("code"));
        slow.setCreater(messenger.getString("creater"));
        slow.setCreateTime(messenger.getString("createTime"));
        slow.setUpdater(messenger.getString("updater"));
        slow.setUpdateTime(messenger.getString("updateTime"));
        return slow;
    }
}
