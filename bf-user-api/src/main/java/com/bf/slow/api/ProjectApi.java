package com.bf.slow.api;

import com.bf.slow.common.MessengerVo;

public interface ProjectApi {

    MessengerVo add(MessengerVo messenger);
    MessengerVo delete(MessengerVo messenger);
    MessengerVo update(MessengerVo messenger);
    MessengerVo selete(MessengerVo messenger);

}
