package com.hillel.dolhunin.homeworks.homework12;

public class MainBurger {
    public static void main(String[] args) {

        Burger burger = new Burger("Булочка", "М'ясо", "Сир", "Зелень", "Майонез");
        Burger dietBurger = new Burger("Булочка", "М'ясо", "Сир", "Зелень");
        Burger doubleBurger = new Burger("Булочка", "М'ясо", "Сир", "Зелень", "Майонез", "Друге м'ясо");
    }

}
