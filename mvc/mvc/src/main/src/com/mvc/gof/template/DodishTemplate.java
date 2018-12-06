package com.mvc.gof.template;

/**
 * @author wsw
 * @Date 2018/11/25
 * 使用 模板模式
 *      做不同菜需要的料，做的方法，以及如何盛装都不同
 * 做菜-备料->做菜->上菜
 *
 */
public abstract class DodishTemplate {

    /**
     * 备料
     */
    public abstract void prepare();

    /**
     * 做菜
     */
    public abstract void doing();

    /**
     * 上菜
     */
    public abstract void carry();

    /**
     *
     */
    public void dish() {
        this.prepare();
        this.doing();
        this.carry();
    }
}
