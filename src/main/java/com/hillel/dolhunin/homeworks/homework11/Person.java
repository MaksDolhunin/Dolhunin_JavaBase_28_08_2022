package com.hillel.dolhunin.homeworks.homework11;

public class Person {
    public static void main(String[] args) {

        System.out.println(personInfo("Will", "Smith", "New York", "2936729462846"));
        System.out.println(personInfo("Jackie", "Chan", "Shanghai", "12312412412"));
        System.out.println(personInfo("Sherlock", "Holmes", "London", "37742123513"));


    }
    static String personInfo(String name, String surname, String city, String phoneNumber) {
        return "Зателефонувати громадянину "+ name + " " + surname + " із міста "+ city + " можна за номером " + phoneNumber;
    }
}
