package com.mvc.gof.chain;

/**
 * @author wsw
 * @Date 2018/11/27
 */
public class ChainApp {
    public static void main(String[] args) {

        Boss boss = new Boss();
        DepManager dep = new DepManager();
        dep.setHandler(boss);
        PersonOne one = new PersonOne();
        one.setHandler(dep);

        one.handlerRequest(2);
    }
}
