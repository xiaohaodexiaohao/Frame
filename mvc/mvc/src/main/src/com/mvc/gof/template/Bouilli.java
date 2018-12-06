package com.mvc.gof.template;

/**
 * @author wsw
 * @Date 2018/11/25
 * 具体的一个子类【红烧肉】
 */
public class Bouilli extends DodishTemplate {

    @Override
    public void prepare() {
        System.out.println("切猪肉和土豆。");
    }

    @Override
    public void doing() {
        System.out.println("将切好的猪肉倒入锅中炒一会然后倒入土豆连炒带炖。");
    }

    @Override
    public void carry() {
        System.out.println("将做好的红烧肉盛进碗里端给客人吃。");
    }
}
