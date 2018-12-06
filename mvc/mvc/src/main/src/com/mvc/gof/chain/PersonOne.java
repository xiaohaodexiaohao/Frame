package com.mvc.gof.chain;

/**
 * @author wsw
 * @Date 2018/11/27
 */
public class PersonOne extends Handler {

    @Override
    public void handlerRequest(int day) {
        handler.handlerRequest(day);
    }
}
