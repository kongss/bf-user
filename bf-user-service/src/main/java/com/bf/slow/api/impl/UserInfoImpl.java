package com.bf.slow.api.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.bf.slow.api.UserInfoApi;
import com.bf.slow.api.entity.User;
import com.bf.slow.dao.UserInfoMapper;
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

}
