package com.dist.service;

import com.alibaba.dubbo.config.annotation.Service;
import com.dist.api.Message;

/**
 * @author wsw
 */
@Service(interfaceClass = Message.class, version = "1.0.0")
public class MessageImpl implements Message {

    @Override
    public String say(String msg) {
        System.out.println("service msg");
        return msg + msg;
    }
}
