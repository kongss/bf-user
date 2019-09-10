package com.bf.slow.api.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bf.slow.api.UserInfoApi;
import com.bf.slow.common.MessengerVo;
import com.bf.slow.dao.UserInfoMapper;
import com.bf.slow.User;
import com.bf.slow.param.QueryUserParam;
import org.apache.dubbo.config.annotation.Service;

/**
 * UserInfoImpl
 *
 * @author kongshuaishuai
 * Created on 2019/5/20 12:48
 * Email is kongshuaishuai@mrfresh.com
 * Copyright is
 */

@Service
public class UserInfoImpl extends ServiceImpl<UserInfoMapper, User> implements UserInfoApi {

    @Override
    public MessengerVo getUser(QueryUserParam queryUserParam) {
        MessengerVo messengerVo = new MessengerVo();
        User user = this.getById("1");
        messengerVo.setInfo("user", user);
        return messengerVo;
    }
}
