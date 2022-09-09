package com.hillel.dolhunin.homeworks.homework2;

import java.text.DecimalFormat;

public class Bunker {
    public static void main(String[] args) {
        int firstNumber = 38;
        char charDeg = 186;
        int secondNumber = 44;
        char charQuote = 39;
        double firstDouble = 32.91;
        char charQuotes = '\u0022';
        char charN = 'N';
        int thirdNumber = 104;
        int fourthNumber = 50;
        float firstFloat = 54.40F;
        String resultFirstFloat = new DecimalFormat("#0.00").format(firstFloat).replace(',', '.');
        char charW = 'W';
        String putinBunker = firstNumber + "" + charDeg + secondNumber + charQuote + firstDouble + charQuotes + charN + " " + thirdNumber + charDeg +fourthNumber + charQuote + resultFirstFloat + charQuotes + charW;
        System.out.println(putinBunker);
    }
}
