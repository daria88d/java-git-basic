package ru.otus.java.basic.lesson1;

import java.util.Scanner;

public class MainApplication {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число");
        int a = scanner.nextInt();
        System.out.println("Введите второе число");
        int b = scanner.nextInt();
        System.out.println("Укажите операцию: 1+, 2-, 3*, 4/");
        int operation = scanner.nextInt();
        if (operation == 1) {
            int result = a + b;
            System.out.println(a + " + " + b + " = " + result);
        }
        if (operation == 2) {
            int result = a - b;
            System.out.println(a + " - " + b + " = " + result);
        }
        if (operation == 3) {
            int result = a * b;
            System.out.println(a + " * " + b + " = " + result);
        }
        if (operation == 4) {
            int result = a / b;
            System.out.println(a + " / " + b + " = " + result);
        }
        System.out.println("1");
        System.out.println("2");
    }
}
