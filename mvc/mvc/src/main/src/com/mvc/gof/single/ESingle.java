package com.mvc.gof.single;

/**
 * @author wsw
 * @Date 2018/11/27
 */
public enum ESingle {
    INSTANCE {
        @Override
        public String getName() {
            return "single";
        }
    };

    public abstract String getName();
}
