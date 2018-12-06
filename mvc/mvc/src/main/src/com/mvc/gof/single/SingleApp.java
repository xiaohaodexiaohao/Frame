package com.mvc.gof.single;

/**
 * @author wsw
 * @Date 2018/11/27
 */
public class SingleApp {
    public static void main(String[] args) {
        // 饿汉模式
        HungryTools hungryTools1 = HungryTools.getInstance();
        HungryTools hungryTools2 = HungryTools.getInstance();
        System.out.println(hungryTools1 == hungryTools2);
    }
}
