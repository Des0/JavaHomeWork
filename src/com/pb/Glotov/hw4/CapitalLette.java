package com.pb.Glotov.hw4;

import java.util.Scanner;
import java.io.PrintStream;

public class CapitalLette {

    public  void procedure() {
        Scanner in = new Scanner(System.in);
        System.out.print("Введите первое предложение: ");


    }

    public static void main(String[] args) {
        final PrintStream c = new PrintStream(System.out);
        Scanner s = new Scanner(System.in);
        c.println("Введите строку :");
        String str = s.nextLine();
        String result = "";
        if(str != null) {
            if(str.charAt(0) != ' ') {
                result += str.substring(0, 1).toUpperCase();
            }
            for(int i = 1, n = str.length(); i < n; i++) {
                if(str.charAt(i - 1) == ' ' && str.charAt(i) != ' ')  {
                    result += str.substring(i, i + 1).toUpperCase();
                } else {
                    result += str.substring(i, i + 1);
                }
            }
        }
        c.println("Преоброзованная строка: \n" + result);
    }
}
