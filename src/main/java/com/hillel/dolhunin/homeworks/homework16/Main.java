package com.hillel.dolhunin.homeworks.homework16;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        run();

    }

    static void run() {

        Scanner scanner = new Scanner(System.in);
        DrinksMachine[] drinksMachines = DrinksMachine.values();
        int totalSum = 0;
        int counter = 0;
        while (true) {
            DrinksMachine drinksMachine = null;
            System.out.println("Введіть назву напою із списку " + Arrays.toString(drinksMachines) + " або введіть EXIT для завершення!");
            while (true) {
                String userValue = scanner.nextLine().toUpperCase();
                if (userValue.equals("EXIT")) {
                    System.out.println("Загальна вартість: " + totalSum);
                    System.out.println("Загальна кількість виготовлених напоїв: " + counter);
                    System.exit(0);
                }
                for (DrinksMachine drinks: drinksMachines) {
                    if (userValue.equals(drinks.toString())) {
                        drinksMachine = DrinksMachine.valueOf(userValue);
                        break;
                    }
                }
                if (drinksMachine != null) {
                    break;
                } else {
                    System.out.println("Wrong data");
                }
            }
            switch (drinksMachine) {
                case COFFEE -> {
                    System.out.println("Ваш " + DrinksMachine.COFFEE.getTitle() + " готовий, його вартість " + Drinks.getPriceCoffee());
                    totalSum += Drinks.getPriceCoffee();
                    counter++;
                }
                case TEA -> {
                    System.out.println("Ваш " + DrinksMachine.TEA.getTitle() + " готовий, його вартість " + Drinks.getPriceTea());
                    totalSum += Drinks.getPriceTea();
                    counter++;
                }
                case LEMONADE -> {
                    System.out.println("Ваш " + DrinksMachine.LEMONADE.getTitle() + " готовий, його вартість " + Drinks.getPriceLemonade());
                    totalSum += Drinks.getPriceLemonade();
                    counter++;
                }
                case MOJITO -> {
                    System.out.println("Ваше " + DrinksMachine.MOJITO.getTitle() + " готове, його вартість " + Drinks.getPriceMojito());
                    totalSum += Drinks.getPriceMojito();
                    counter++;
                }
                case MINERAL_WATER -> {
                    System.out.println("Ваша " + DrinksMachine.MINERAL_WATER.getTitle() + " готова, її вартість " + Drinks.getPriceMineralWater());
                    totalSum += Drinks.getPriceMineralWater();
                    counter++;
                }

                case COCA_COLA -> {
                    System.out.println("Ваша " + DrinksMachine.COCA_COLA.getTitle() + " готова, її вартість " + Drinks.getPriceCocaCola());
                    totalSum += Drinks.getPriceCocaCola();
                    counter++;
                }
            }
        }
    }
}
