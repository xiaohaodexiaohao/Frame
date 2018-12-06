package com.mvc.gof.single;

/**
 * @author wsw
 * @Date 2018/11/27
 */
public class ESApp {
    public static void main(String[] args) {
        ESingle instance = ESingle.INSTANCE;
        System.out.println(instance.getName());

        System.out.println(System.getProperty("os.name"));
    }
}
