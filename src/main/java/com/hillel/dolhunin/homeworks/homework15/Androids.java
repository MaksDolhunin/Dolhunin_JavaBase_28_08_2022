package com.hillel.dolhunin.homeworks.homework15;

public class Androids implements LinuxOS, Smartphones{

    private String name;

    public Androids(String name) {
        this.name = name;
    }


    void printInfoAndroid() {
        linuxLoad();
        call();
        sms();
        internet();

    }

    @Override
    public void linuxLoad() {
        System.out.println("Запускається система Linux на Android");
    }

    @Override
    public void call() {
        System.out.println("Запускається система Call на Android");
    }

    @Override
    public void sms() {
        System.out.println("Запускається система Sms на Android");
    }

    @Override
    public void internet() {
        System.out.println("Запускається система Internet на Android");
    }

}
