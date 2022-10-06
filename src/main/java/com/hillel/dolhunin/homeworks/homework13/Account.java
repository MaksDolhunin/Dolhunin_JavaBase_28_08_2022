package com.hillel.dolhunin.homeworks.homework13;

import java.util.Calendar;

public class Account {
    private String name;
    private int birthdayDay;
    private int birthdayMonth;
    private int birthdayYear;
    private String email;
    private int phoneNumber;
    String surname;
    int weight;
    int pressure;
    int amountSteps;
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
        if(birthdayYear <= 1900) {
            birthdayYear = Integer.parseInt("Error!");
        } else if (birthdayYear > 2022) {
            birthdayYear = Integer.parseInt("Error!");
        } else {
            return birthdayYear;
        }
        return birthdayYear;
    }
    public int getBirthdayMonth() {
        if(birthdayMonth > 0 && birthdayMonth <= 12) {
            return birthdayMonth;
        } else {
            birthdayMonth = Integer.parseInt("Error! Введіть число від 1 до 12!");
        }
        return birthdayMonth;
    }
    public int getBirthdayDay() {
        if(birthdayDay > 0 && birthdayDay < 31) {
            return birthdayDay;
        } else {
            birthdayDay = Integer.parseInt("Error! Введіть число від 1 до 31!");
        }
        return birthdayDay;
    }
    public String getEmail() {
        return email;
    }
    public int getPhoneNumber() {
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
