package com.mvc.gof.chain;

/**
 * @author wsw
 * @Date 2018/11/27
 */
public class DepManager extends Handler {

    @Override
    public void handlerRequest(int day) {
        if (day == 1) {
            System.out.println("depManager ok");
        } else {
            handler.handlerRequest(day);
        }
    }
}
