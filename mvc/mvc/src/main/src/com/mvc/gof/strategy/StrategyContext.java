package com.mvc.gof.strategy;

/**
 * @author wsw
 * @Date 2018/11/29
 */
public class StrategyContext {

    private ExportStrategy strategy;

    public StrategyContext(ExportStrategy strategy) {
        this.strategy = strategy;
    }

    public String export() {
        return this.strategy.export();
    }
}
