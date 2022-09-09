package com.hillel.dolhunin.homeworks.homework3;

public class Parallelepiped {
    public static void main(String[] args) {

        final int A = 10;
        final int B = 20;
        final int C = 18;

        int volume = A * B * C;

        System.out.println("Об'єм паралелепіпеда = " + volume);

        int length = (A + B + C) * 4;

        System.out.println(length);

    }
}
