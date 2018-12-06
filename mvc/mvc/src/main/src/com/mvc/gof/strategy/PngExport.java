package com.mvc.gof.strategy;

/**
 * @author wsw
 * @Date 2018/11/29
 */
public class PngExport implements ExportStrategy {

    @Override
    public String export() {
        return "png export";
    }
}
