package com.telran.oop.encapsulation.lock;

import java.util.Scanner;

public class Lock {

    private final int ID;
    private int cod;
    Scanner scanner;


    public Lock(int id) {
        ID = id;
        cod = 111;
        scanner = new Scanner(System.in);
    }

    public void setCod() {
        while (true) {
            System.out.println("Введите старый код");
            int oldСode = scanner.nextInt();
            if (oldСode == cod) {
                System.out.println("Введите свой новый код");
                int newCode = scanner.nextInt();
                cod = newCode;
            } else {
                System.out.println("Ваш код неверен");
            }
        }
    }
}
