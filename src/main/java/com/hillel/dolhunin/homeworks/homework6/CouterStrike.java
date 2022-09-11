package com.hillel.dolhunin.homeworks.homework6;

import java.util.Scanner;

public class CouterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double sumTeam1 = 0;
        double sumTeam2 = 0;

        String teamName1 = scanner.nextLine();

        System.out.println("Player taem 1: ");
        if (scanner.hasNextInt()) {
            int player1 = scanner.nextInt();
            sumTeam1 = player1;
        } else {
            System.out.println("Помилка! Будь-ласка, введіть число");
        }
        if (scanner.hasNextInt()) {
            int player2 = scanner.nextInt();
            sumTeam1 = sumTeam1 + player2;
        } else {
            System.out.println("Помилка! Будь-ласка, введіть число");
        }
        if (scanner.hasNextInt()) {
            int player3 = scanner.nextInt();
            sumTeam1 = sumTeam1 + player3;
        } else {
            System.out.println("Помилка! Будь-ласка, введіть число");
        }
        if (scanner.hasNextInt()) {
            int player4 = scanner.nextInt();
            sumTeam1 = sumTeam1 + player4;
        } else {
            System.out.println("Помилка! Будь-ласка, введіть число");
        }
        if (scanner.hasNextInt()) {
            int player5 = scanner.nextInt();
            sumTeam1 = sumTeam1 + player5;
        } else {
            System.out.println("Помилка! Будь-ласка, введіть число");
        }
        scanner.nextLine();
        double averageScoreTeam1 = sumTeam1 / 5;
        System.out.println(averageScoreTeam1);

        String teamName2 = scanner.nextLine();

        System.out.println("Player team 2: ");
        if (scanner.hasNextInt()) {
            int player1 = scanner.nextInt();
            sumTeam2 = player1;
        } else {
            System.out.println("Помилка! Будь-ласка, введіть число");
        }
        if (scanner.hasNextInt()) {
            int player2 = scanner.nextInt();
            sumTeam2 = sumTeam2 + player2;
        } else {
            System.out.println("Помилка! Будь-ласка, введіть число");
        }
        if (scanner.hasNextInt()) {
            int player3 = scanner.nextInt();
            sumTeam2 = sumTeam2 + player3;
        } else {
            System.out.println("Помилка! Будь-ласка, введіть число");
        }
        if (scanner.hasNextInt()) {
            int player4 = scanner.nextInt();
            sumTeam2 = sumTeam2 + player4;
        } else {
            System.out.println("Помилка! Будь-ласка, введіть число");
        }
        if (scanner.hasNextInt()) {
            int player5 = scanner.nextInt();
            sumTeam2 = sumTeam2 + player5;
        } else {
            System.out.println("Помилка! Будь-ласка, введіть число");
        }
        scanner.nextLine();
        double averageScoreTeam2 = sumTeam2 / 5;
        System.out.println(averageScoreTeam2);

        if (averageScoreTeam1 > averageScoreTeam2) {
            System.out.println("Перемогла команда " + teamName1 + " набрала " + averageScoreTeam1 + " очків");
        } else if (averageScoreTeam1 < averageScoreTeam2) {
            System.out.println("Перемогла команда " + teamName2 + " набрала " + averageScoreTeam2 + " очків");
        } else {
            System.out.println("Нічия! Перемогла дружба!");
        }
    }
}
