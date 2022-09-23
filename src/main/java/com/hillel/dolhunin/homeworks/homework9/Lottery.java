package com.hillel.dolhunin.homeworks.homework9;

import java.util.Arrays;

public class Lottery {
    public static void main(String[] args) {

        int N = 7;
        int[] lotteryArray = new int[N];
        int[] userArray = new int[N];
        int counter = 0;

        for (int i = 0; i < lotteryArray.length; i++) {
            lotteryArray[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(lotteryArray));

        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = (int) (Math.random() * 10);
        }
        System.out.println(Arrays.toString(userArray));

        System.out.println();

        Arrays.sort(lotteryArray);
        Arrays.sort(userArray);

        System.out.println(Arrays.toString(lotteryArray));
        System.out.println(Arrays.toString(userArray));

        if(lotteryArray[0] == userArray[0]) {
            System.out.println("Совпадение в первой ячейке!");
            counter++;
        }
        if(lotteryArray[1] == userArray[1]) {
            System.out.println("Совпадение во второй ячейке!");
            counter++;
        }
        if(lotteryArray[2] == userArray[2]) {
            System.out.println("Совпадение в третьей ячейке!");
            counter++;
        }
        if(lotteryArray[3] == userArray[3]) {
            System.out.println("Совпадение в четвертой ячейке!");
            counter++;
        }
        if(lotteryArray[4] == userArray[4]) {
            System.out.println("Совпадение в пятой ячейке!");
            counter++;
        }
        if(lotteryArray[5] == userArray[5]) {
            System.out.println("Совпадение в шестой ячейке!");
            counter++;
        }
        if(lotteryArray[6] == userArray[6]) {
            System.out.println("Совпадение в седьмой ячейке!");
            counter++;
        }
        System.out.println();
        System.out.println("Всего совпадений - " + counter);
    }
}