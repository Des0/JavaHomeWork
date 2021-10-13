package com.pb.Glotov.hw2;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.println("Введите первое целое число: ");
        int operand1 = in.nextInt();

        System.out.print("Введите второе целое число: ");
        int operand2 = in.nextInt();

        System.out.println("Введите арефметическое действие(+-*/): ");
        String symbol = in.next();

        switch (symbol) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/":
                if (operand2 == 0) {
                    System.out.println("Ошибка деления на ноль");
                    break;
                } else {
                    System.out.println(operand1 / operand2);
                }

        }
    }
}
