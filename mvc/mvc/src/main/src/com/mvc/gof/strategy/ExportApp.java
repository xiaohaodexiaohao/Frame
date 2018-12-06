package com.mvc.gof.strategy;

/**
 * @author wsw
 * @Date 2018/11/29
 */
public class ExportApp {
    public static void main(String[] args) {
        StrategyContext context = new StrategyContext(new PngExport());
        System.out.println(context.export());
    }
}
