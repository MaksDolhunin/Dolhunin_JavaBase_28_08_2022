package com.hillel.dolhunin.homeworks.homework15;

public class Main {
    public static void main(String[] args) {

        Androids androids = new Androids("Samsung Galaxy Ultra");
        IPhones iPhones = new IPhones("iPhone 14 Pro");

        androids.printInfoAndroid();
        System.out.println();
        iPhones.printInfoIphone();



    }
}
