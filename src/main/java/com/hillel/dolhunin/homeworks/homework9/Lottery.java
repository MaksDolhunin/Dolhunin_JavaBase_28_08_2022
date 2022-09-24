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

        for (int i = 0; i < userArray.length; i++) {
            userArray[i] = (int) (Math.random() * 10);
        }

        Arrays.sort(lotteryArray);
        Arrays.sort(userArray);

        System.out.println(Arrays.toString(lotteryArray));
        System.out.println(Arrays.toString(userArray));
        System.out.println();

        for (int i = 0; i < N; i++) {
            if(lotteryArray[i] == userArray[i]) {
                counter += 1;
                System.out.println("Збіги у комірці - " + (i + 1));
            }
        }
        System.out.println();
        System.out.println("Кількість збігів: " + counter);
    }
}


