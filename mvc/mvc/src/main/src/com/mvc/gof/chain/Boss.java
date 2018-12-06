package com.mvc.gof.chain;

/**
 * @author wsw
 * @Date 2018/11/27
 */
public class Boss extends Handler {

    @Override
    public void handlerRequest(int day) {
        if (day < 5) {
            System.out.println("boss ok");
        } else {
            System.out.println("boss no");
        }
    }
}
