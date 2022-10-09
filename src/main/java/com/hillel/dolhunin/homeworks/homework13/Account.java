package com.hillel.dolhunin.homeworks.homework13;

import java.util.Calendar;

public class Account {
    private final String name;
    private final int birthdayDay;
    private final int birthdayMonth;
    private final int birthdayYear;
    private final String email;
    private final long phoneNumber;
    private String surname;
    private int weight;
    private int pressure;
    private int amountSteps;
    private final int VALUE = 2020;
    private int age;
    public Account(String name,
                   int birthdayDay, int birthdayMonth, int birthdayYear,
                   String email,
                   int phoneNumber,
                   String surname,
                   int weight,
                   int pressure,
                   int amountSteps) {
        this.name = name;
        this.birthdayDay = birthdayDay;
        this.birthdayMonth = birthdayMonth;
        this.birthdayYear = birthdayYear;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.surname = surname;
        this.weight = weight;
        this.pressure = pressure;
        this.amountSteps = amountSteps;
    }
    public String getName() {
        return name;
    }
    public int getBirthdayYear() {
        return birthdayYear;
    }
    public int getBirthdayMonth() {
        return birthdayMonth;
    }
    public int getBirthdayDay() {
        return birthdayDay;
    }
    public String getEmail() {
        return email;
    }
    public long getPhoneNumber() {
        return phoneNumber;
    }
    public String getSurname() {
        return surname;
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public int getWeight() {
        if (weight < 1) {
            weight = Integer.parseInt("Error! Вага не може бути від'ємною!");
        } else {
            return weight;
        }
        return weight;
    }
    public void setWeight(int weight) {
        this.weight = weight;
    }
    public int getPressure() {
        if (pressure < 1) {
            pressure = Integer.parseInt("Error! Здається " + name + " має проблеми");
        } else {
            return pressure;
        }
        return pressure;
    }
    public void setPressure(int pressure) {
        this.pressure = pressure;
    }
    public int getAmountSteps() {
        if (amountSteps < 1) {
            amountSteps = Integer.parseInt("Error!");
        } else {
            return amountSteps;
        }
        return amountSteps;
    }
    public void setAmountSteps(int amountSteps) {
        this.amountSteps = amountSteps;
    }
    void printAccountInfo() {
        System.out.println(
                "User name - " + getName() + " " + "\n" +
                "Surname - " + getSurname() + " " + "\n" +
                "Date of birthday - " + getBirthdayDay() + "." + getBirthdayMonth() + "." + getBirthdayYear() + "\n" +
                        "Age - " + getAge() + "\n" +
                        "Email - " + getEmail() + "\n" +
                        "Phone number - +380" + getPhoneNumber() + "\n" +
                        "Weight - " + getWeight() + "\n" +
                        "Pressure - " + getPressure() + "\n" +
                        "Steps - " + getAmountSteps()
        );
    }
    public int getAge() {
        age = VALUE - birthdayYear;
        return age;
    }

    @Override
    public String toString() {
        return "Account{" +
                "name='" + name + '\'' +
                ", birthdayYear=" + birthdayYear +
                ", birthdayMonth=" + birthdayMonth +
                ", birthdayDay=" + birthdayDay +
                ", email='" + email + '\'' +
                ", phoneNumber=" + phoneNumber +
                ", surname='" + surname + '\'' +
                ", weight=" + weight +
                ", pressure=" + pressure +
                ", amountSteps=" + amountSteps +
                '}';
    }
}
