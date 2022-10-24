package com.company;

import java.util.Scanner;
import java.util.regex.Pattern;

public class TestPassword {
    public static boolean checkPass(String s){
        return Pattern.compile("(?=.*[0-9])(?=.*[!@#$%^&*])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z!@#$%^&*]{8,}/g").matcher(s).find();
    }

    public static void main(String[] args) {
        boolean f = true;
        while (f) {
            System.out.println("\nВыберите одну из двух команд:");
            System.out.println("1 - Проверка пароля");
            System.out.println("Любая другая клавиша - выход из программы");
            Scanner sc = new Scanner(System.in);
            char choice = sc.nextLine().charAt(0);
            if (choice == '1') {
                System.out.println("Введите пароль для проверки");
                String password = sc.nextLine();
                if (checkPass(password)) {
                    System.out.println("Пароль \"" + password + "\" надежен");
                } else {
                    System.out.println("Пароль \"" + password + "\" ненадежен");
                }
            } else {
                System.out.println("До свидания");
                f = false;
            }
        }
    }
}
