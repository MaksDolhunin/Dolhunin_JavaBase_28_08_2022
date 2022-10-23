package com.hillel.dolhunin.homeworks.homework17;

public class Main {

    public static int matrixSquire(int[][] array) {
        if (array == null) {
            return -1;
        } else {
            for(int[] arr : array) {
                if (arr.length == array.length) {
                   return 1;
                }
            }
            return 0;
        }
    }

    public static double doubleAverage(int[] array) {
        double totalSum = 0;
        if (array == null || array.length == 0) {
            return 0;
        } else {
            for (int i: array) {
                totalSum += i;
            }
            return totalSum / array.length;
        }
    }
}

