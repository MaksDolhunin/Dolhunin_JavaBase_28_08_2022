package com.hillel.dolhunin.homeworks.homework12;

public class Burger {
    String bun;
    String meat;
    String cheese;
    String greens;
    String mayonnaise;
    String secondMeat;

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        System.out.println("Бургер: " +
                bun + " " +
                meat + " " +
                cheese + " " +
                greens + " " +
                mayonnaise);
    }
    public Burger(String bun, String meat, String cheese, String greens) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        System.out.println(this);
    }

    public Burger(String bun, String meat, String cheese, String greens, String mayonnaise, String secondMeat) {
        this.bun = bun;
        this.meat = meat;
        this.cheese = cheese;
        this.greens = greens;
        this.mayonnaise = mayonnaise;
        this.secondMeat = secondMeat;
        System.out.println("Бургер: " +
                bun + " " +
                "Подвійне " + meat + " " +
                cheese + " " +
                greens + " " +
                mayonnaise);
    }

    @Override
    public String toString() {
        return "Бургер: " +
                bun + " " +
                meat + " " +
                cheese + " " +
                greens;
    }
}
