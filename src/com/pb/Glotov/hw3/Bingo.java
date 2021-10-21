package com.pb.Glotov.hw3;

import java.util.Scanner;
import java.util.Random;

public class Bingo {
    public static class NumberRandom {
        public static void main(String[] args) {

            int random, b, count;
            Scanner keyboard = new Scanner(System.in);
            Random generator = new Random();
            random = generator.nextInt(100) + 1;
            count = 1;

            System.out.println("Для выхода из программы введите значение -1.");
            System.out.println("Введите число от 0 до 100");

            b = keyboard.nextInt();
            while (b != random) {

                if (b > random) {
                    System.out.println("Вы ввели число, больше чем загадано!");
                    count  += 1;
                }

                else {
                    System.out.println("Вы ввели число, меньше чем загадано!!");
                    count +=1;
                }
                b = keyboard.nextInt();

                if (b == -1) {
                    break;
                }

            }
            while(b == random) {
                System.out.println("Вы угадали, загаданное число:" + random + "  Количество попыток: " + count);
                break;
            }
        }

        }
    }


