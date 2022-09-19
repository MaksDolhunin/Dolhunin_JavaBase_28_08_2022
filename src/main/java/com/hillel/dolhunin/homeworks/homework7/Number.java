package com.hillel.dolhunin.homeworks.homework7;

import java.util.Scanner;

public class Number {
    public static void main(String[] args) {

        int unknownNumber = (int) (Math.random() * 11);

        System.out.println("Починаймо гру!");
        System.out.println("(перевіряються та рахуються в використану спробу тільки введені числа)");

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i <= 6; ++i) {
            if (scanner.hasNextInt()) {
                int userNumber = scanner.nextInt();
                if (userNumber == unknownNumber) {
                    System.out.println("Ви вгадали число - " + userNumber + ", кількість спроб - " + (i+1));
                    break;
                } else if (userNumber < unknownNumber) {
                    System.out.println("Ваше число меньше!");
                } else {
                    System.out.println("Ваше число більше!");
                }
                scanner.nextLine();
            } else {
                System.out.println("Помилка! Будь-ласка, введіть число!");
                scanner.nextLine();
                i--;
            }
            if (i == 6) {
                System.out.println("Your lose!");
            }
        }
    }
}
