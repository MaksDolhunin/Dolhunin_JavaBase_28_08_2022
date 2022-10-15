package com.hillel.dolhunin.homeworks.homework15;

public class IPhones implements IOS, Smartphones {

    private String name;

    public IPhones(String name) {
        this.name = name;
    }

    void printInfoIphone() {
        iosLoad();
        call();
        sms();
        internet();

    }

    @Override
    public void iosLoad() {
        System.out.println("Запускається система iOS на iPhone");
    }

    @Override
    public void call() {
        System.out.println("Запускається система Call на iPhone");
    }

    @Override
    public void sms() {
        System.out.println("Запускається система Sms на iPhone");
    }

    @Override
    public void internet() {
        System.out.println("Запускається система Internet на iPhone");
    }
}
