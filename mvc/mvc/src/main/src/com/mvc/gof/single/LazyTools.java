package com.mvc.gof.single;

/**
 * @author wsw
 * @Date 2018/11/27
 * 懒汉模式
 */
public class LazyTools {

    private static LazyTools instance;

    /**
     * 多线程时依旧会创建多个instance
     * @return
     */
    public static LazyTools getInstance() {
        if (instance == null) {
            return new LazyTools();
        }
        return instance;
    }

    public static LazyTools getInstance1() {
        synchronized (LazyTools.class) {
            if (instance == null) {
                return new LazyTools();
            }
            return instance;
        }
    }

    /**
     * 避免每次调用都加锁
     * @return
     */
    public static LazyTools doubleCheck() {
        if (instance == null) {
            // 多线程下，第一次都可能进入这里
            synchronized (LazyTools.class) {
                // 如果不加判断：依旧会创建多个 实例。
                // 第一个线程创建后，后续线程判断 instance 已经实例化后就返回
                if (instance == null) {
                    return new LazyTools();
                }
            }
        }
        return instance;
    }
}
