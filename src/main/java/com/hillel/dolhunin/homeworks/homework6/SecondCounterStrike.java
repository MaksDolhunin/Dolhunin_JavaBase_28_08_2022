package com.hillel.dolhunin.homeworks.homework6;

import java.util.Scanner;

public class SecondCounterStrike {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String nameTeam1 = scanner.nextLine();
        String nameTeam2 = scanner.nextLine();
        System.out.println(nameTeam1);
        System.out.println(nameTeam2);

        int teamCount1 = 0;
        int teamCount2 = 0;
        final double COEF = 5;

        for(int i = 0; i < 2; i++) {
            for(int j = 0; j <= 4; j++) {
                if (i == 0) {
                    if (scanner.hasNextInt()) {
                        int playerNumb = scanner.nextInt();
                        teamCount1 += playerNumb;
                        scanner.nextLine();
                    } else {
                        System.out.println("Помилка! Будь-ласка, введіть число");
                        scanner.nextLine();
                        j--;
                    }
                } else if (i == 1) {
                    if (scanner.hasNextInt()) {
                        int playerNumb = scanner.nextInt();
                        teamCount2 += playerNumb;
                        scanner.nextLine();
                    } else {
                        System.out.println("Помилка! Будь-ласка, введіть число");
                        scanner.nextLine();
                        j--;
                    }
                }
            }
        }
        double averageScoreTeam1 = teamCount1 / COEF;
        double averageScoreTeam2 = teamCount2 / COEF;
        System.out.println(averageScoreTeam1);
        System.out.println(averageScoreTeam2);

        if (averageScoreTeam1 > averageScoreTeam2) {
            System.out.println("Перемогла команда " + nameTeam1 + " набрала " + averageScoreTeam1 + " очків");
        } else if (averageScoreTeam1 < averageScoreTeam2) {
            System.out.println("Перемогла команда " + nameTeam2 + " набрала " + averageScoreTeam2 + " очків");
        } else {
            System.out.println("Нічия! Перемогла дружба!");
        }
    }
}
