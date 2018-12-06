package com.mvc.gof.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * @author wsw
 * @Date 2018/11/27
 * 公众号
 */
public class WeChat {

    private List<Observer> observers = new ArrayList<>();

    public void attach(Observer observer) {
        observers.add(observer);
    }

    public void detach(Observer observer) {
        observers.remove(observer);
    }

    public void didi() {
        for (Observer observer : observers) {
            observer.update();
        }
    }
}
