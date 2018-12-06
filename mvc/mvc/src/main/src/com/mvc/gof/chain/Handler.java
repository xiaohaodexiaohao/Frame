package com.mvc.gof.chain;

/**
 * @author wsw
 * @Date 2018/11/27
 */
public abstract class Handler {

    protected Handler handler;

    public void setHandler(Handler handler) {
        this.handler = handler;
    }

    public abstract void handlerRequest(int day);
}
