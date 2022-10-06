package com.hillel.dolhunin.homeworks.homework13;

public class Main {
    public static void main(String[] args) {

        Account alex = new Account("Alex", 13, 10, 1987, "alex@gmail.com", 975674325, "Ivanov", 91, 90, 9756);
        Account nikita = new Account("Nikita", 23, 3, 2000, "nikita@gmail.com", 665656544, "Sidorov", 84, 87, 13564);
        Account olha = new Account("OLha", 3, 9, 1996, "olha@gmail.com", 935463456, "Popova", 52, 73, 18563);
        Account anna = new Account("Anna", 20, 8, 1967, "anna@gmail.com", 967878544, "Kyznetsova", 61, 78, 10454);
        Account kate = new Account("Kate", 1, 11, 2001, "kate@gmail.com", 977875657, "Smirnova", 56, 78, 23765);

        alex.printAccountInfo();
        System.out.println();
        nikita.printAccountInfo();
        System.out.println();
        olha.printAccountInfo();
        System.out.println();
        anna.printAccountInfo();
        System.out.println();
        kate.printAccountInfo();
        System.out.println();

        anna.setSurname("Filipova");
        anna.setWeight(54);
        anna.printAccountInfo();
        System.out.println();

        olha.setWeight(51);
        olha.setAmountSteps(23656);
        olha.printAccountInfo();
    }
}
