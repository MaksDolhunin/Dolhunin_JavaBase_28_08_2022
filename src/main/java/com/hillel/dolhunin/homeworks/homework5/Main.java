package com.hillel.dolhunin.homeworks.homework5;

public class Main {
    public static void main(String[] args) {

        int liWarrior = 13 * 860;
        int liArcher = 24 * 860;
        int liRider = 46 * 860;

        final double kof = 1.5;

        int minWarrior = (int) (9 * 860 * kof);
        int minArcher = (int) (35 * 860 * kof);
        int minRider = (int) (12 * 860 * kof);

        int liAttack = liWarrior + liArcher + liRider;
        int minAttack = minWarrior + minArcher + minRider;

        System.out.println("Атака династії Лі - " + liAttack);
        System.out.println("Атака династії Мінь - " + minAttack);
    }
}
