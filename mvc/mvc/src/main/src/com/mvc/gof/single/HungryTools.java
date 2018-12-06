package com.mvc.gof.single;

/**
 * @author wsw
 * @Date 2018/11/27
 * 饿汉模式
 */
public class HungryTools {

    private static HungryTools hungryTools = new HungryTools();

    private HungryTools() {}

    public static HungryTools getInstance() {
        return hungryTools;
    }
}
