package com.hillel.dolhunin.homeworks.homework16;

public enum DrinksMachine {

    COFFEE("Кава"),
    TEA("Чай"),
    LEMONADE("Лимонад"),
    MOJITO("Мохіто"),
    MINERAL_WATER("Мінеральна вода"),
    COCA_COLA("Кока-кола");

    private String title;

    DrinksMachine(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
