package com.hillel.dolhunin.homeworks.homework10;

import java.util.Scanner;

public class Matrix {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        if (scanner.hasNextInt()) {
            int m = scanner.nextInt();
            int n = scanner.nextInt();
            scanner.nextLine();

            if((m > 0) || (n > 0)) {

                int [][] array1 = new int[m][n];
                int [][] array2 = new int[n][m];

                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array1[i].length; j++) {
                        array1[i][j] = (int) (Math.random() * 101);
                      }
                }
                for (int i = 0; i < array1.length; i++) {
                    for (int j = 0; j < array1[i].length; j++) {
                        System.out.print(array1[i][j] + "\t");
                    }
                    System.out.println();
                }
                System.out.println();
                System.out.println();

                for (int i = 0; i < array2.length; i++) {
                    for (int j = 0; j < array2[i].length; j++) {
                        array2[i][j] = (int) (Math.random() * 101);
                    }
                }

                for (int i = 0; i < array2.length; i++) {
                    for (int j = 0; j < array2[i].length; j++) {
                        System.out.print(array2[i][j] + "\t");
                    }
                    System.out.println();
                }
            } else {
                System.out.println("Помилка! Введіть два числа більше нуля!");
            }
        } else {
            System.out.println("Помилка! Введіть число!");
        }
    }
}
