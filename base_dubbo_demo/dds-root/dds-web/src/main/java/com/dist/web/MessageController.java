package com.dist.web;

import com.alibaba.dubbo.config.annotation.Reference;
import com.dist.api.Message;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wsw
 */
@RestController
public class MessageController {

    @Reference(version = "1.0.0")
    private Message message;

    @GetMapping("/hello/{msg}")
    public String helloMsg(@PathVariable String msg) {
        String returnValue = message.say(msg);
        return returnValue;
    }
}
