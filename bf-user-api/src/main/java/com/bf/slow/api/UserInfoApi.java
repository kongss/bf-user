package com.bf.slow.api;

import com.bf.slow.common.MessengerVo;
import com.bf.slow.param.QueryUserParam;


public interface UserInfoApi {

    MessengerVo getUser(QueryUserParam queryUserParam);
}
