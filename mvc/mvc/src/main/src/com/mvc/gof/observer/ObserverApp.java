package com.mvc.gof.observer;

/**
 * @author wsw
 * @Date 2018/11/27
 */
public class ObserverApp {
    public static void main(String[] args) {
        ObserverOne observerOne = new ObserverOne();
        ObserverTwo observerTwo = new ObserverTwo();
        WeChat weChat = new WeChat();
        weChat.attach(observerOne);
        weChat.attach(observerTwo);
        weChat.didi();
    }
}
