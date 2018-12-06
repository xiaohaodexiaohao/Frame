package com.mvc.gof.template;

/**
 * @author wsw
 * @Date 2018/11/25
 */
public class DishApp {
    public static void main(String[] args) {
        DodishTemplate eggsWithTomato = new EggsWithTomato();
        eggsWithTomato.dish();

        System.out.println("-----------------------------");

        DodishTemplate bouilli = new Bouilli();
        bouilli.dish();
    }
}
