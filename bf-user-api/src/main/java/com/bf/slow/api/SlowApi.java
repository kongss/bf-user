package com.bf.slow.api;


import com.bf.slow.common.Messenger;

public interface SlowApi {

    boolean add(Messenger messenger);
    boolean delete(Messenger messenger);
    Messenger update(String id, Messenger messenger);
    Messenger get(Messenger messenger);
    Messenger page(Messenger messenger);
    Messenger list(Messenger messenger);

}
