package com.hillel.dolhunin.homeworks.homework8;

import java.util.Arrays;

public class Rugby {
    public static void main(String[] args) {

        int[] team1 = new int[25];
        int[] team2 = new int[25];

        double amountPlayer = 25;
        int ageTeam1 = 0;
        int ageTeam2 = 0;

        for (int i = 0; i < team1.length; i++) {
            team1[i] = (int) ((Math.random() * 23) + 18);
            ageTeam1 += team1[i];
        }

        for (int i = 0; i < team2.length; i++) {
            team2[i] = (int) ((Math.random() * 23) + 18);
            ageTeam2 += team2[i];
        }

        System.out.println(Arrays.toString(team1));
        System.out.println(Arrays.toString(team2));

        System.out.println(ageTeam1/amountPlayer);
        System.out.println(ageTeam2/amountPlayer);

    }
}




