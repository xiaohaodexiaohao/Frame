package com.mvc.gof.observer;

/**
 * @author wsw
 * @Date 2018/11/27
 */
public class ObserverTwo extends Observer {

    @Override
    public void update() {
        System.out.println("walk");
    }
}
