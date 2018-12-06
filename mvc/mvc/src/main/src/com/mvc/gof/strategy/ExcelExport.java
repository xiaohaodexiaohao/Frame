package com.mvc.gof.strategy;

/**
 * @author wsw
 * @Date 2018/11/29
 */
public class ExcelExport implements ExportStrategy {

    @Override
    public String export() {
        return "excel export";
    }
}
