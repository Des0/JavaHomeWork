package com.pb.Glotov.hw3;

import java.util.Arrays;
import java.util.Scanner;

public class Array {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int array[] = new int[10]; // Создаём массив int размером в size
        int sum = 0;
        int positiveCount = 0;
        System.out.println("Введите 10 элементов массива( целые числа):");

        for (int i = 0; i < 10; i++) {
            array[i] = input.nextInt(); // Заполняем массив элементами, введёнными с клавиатуры
        }
        System.out.print ("Массив, который заполнили:");
        for (int i = 0; i < 10; i++) {
            System.out.print (" " + array[i]); // Выводим на экран, полученный массив
        }
        System.out.println();

        System.out.println ("Сумма всех элементов массива:");
        for (int i = 0; i < 10; i++) {
            sum = sum + array[i];
        }
        System.out.println(sum);

        System.out.println ("Количество положительных элементов:");
        for (int i = 0; i < 10; i++) {
            if (array[i] > 0) {
                positiveCount++;
            }
        }
        System.out.println(positiveCount);


        int temp = 0;
        for(int i=0; i < 10; i++){
            for(int j=1; j < (10-i); j++){
                if(array[j-1] > array[j]){
                    temp = array[j-1];
                    array[j-1] = array[j];
                    array[j] = temp;
                }
            }
            }
        System.out.println ("Отсортированный массив:");
        for(int i=0; i < 10; i++){
            System.out.print(array[i] + " ");
        }

    }

}
