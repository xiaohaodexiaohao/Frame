package com.mvc.gof.template;

/**
 * @author wsw
 * @Date 2018/11/25
 * 具体的一个子类【番茄鸡蛋】
 */
public class EggsWithTomato extends DodishTemplate {

    @Override
    public void prepare() {
        System.out.println("洗并切西红柿，打鸡蛋。");
    }

    @Override
    public void doing() {
        System.out.println("鸡蛋倒入锅里，然后倒入西红柿一起炒。");
    }

    @Override
    public void carry() {
        System.out.println("将炒好的西红寺鸡蛋装入碟子里，端给客人吃。");
    }
}
