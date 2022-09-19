package com.hillel.dolhunin.homeworks.homework7;

public class Shuttle {
    public static void main(String[] args) {

        int counter = 0;
        for (int i = 1; ; i++) {
            if ((i == 4) || (i == 9) || (i / 10 == 4) || (i / 10 == 9) || (i % 10 == 4) || (i % 10 == 9) || (i % 100 == 4) || (i % 100 == 9) || ((i / 10) % 10 == 4) || ((i / 10) % 10 == 9) || (i / 100 == 4) || ((i / 100 == 9))) {
                continue;
            }
            System.out.println("shuttle number:" + i);
            counter++;
            if (counter == 100) {
                break;
            }
        }

        System.out.println("count = " + counter);



    }
}
