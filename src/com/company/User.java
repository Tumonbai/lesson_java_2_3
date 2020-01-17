package com.company;

import java.util.Scanner;

public class User {
    String name;
    int age;

    public String getName() {
        return name;
    }

    public void setName() throws IllegalNameLengthException {
        System.out.println("Введите имя");
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        if(name.length()>20) {
            throw new IllegalNameLengthException("Слишком длинная имя");
        }
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge() {
        System.out.println("Введите ваш возраст");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if(age>100|| age <0) {
            throw new IllegalAgeException("Неправильно указал возраст");
        }
                    this.age = age;
        }
    }
