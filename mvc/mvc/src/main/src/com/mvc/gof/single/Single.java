package com.mvc.gof.single;

/**
 * @author wsw
 * @Date 2018/11/27
 */
public class Single {
    private static Single ourInstance = new Single();

    public static Single getInstance() {
        return ourInstance;
    }

    private Single() {
    }
}
