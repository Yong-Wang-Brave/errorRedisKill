package com.wangyong.redislock.service;

import org.springframework.stereotype.Service;

@Service
public interface haha {

    boolean setnx(String key, String val);

    int delnx(String key, String val);

}
