package com.pb.Glotov.hw2;

import java.util.Scanner;

public class Interval {
    public static void main(String[] args){

        Scanner in = new Scanner(System.in);
        System.out.println("Введите целое число: ");
        int a = in.nextInt();

        if (a>=0 && a<= 14){
            System.out.println("Число принадлежит к диапазону [0-14]");
        }
        else if (a>=15 && a<= 35){
            System.out.println("Число принадлежит к диапазону [15-35]");
        }
        else if (a>=36 && a<= 50){
            System.out.println("Число принадлежит к диапазону [36-50]");
        }
        else if (a>=51 && a<= 100){
            System.out.println("Число принадлежит к диапазону [51-100]");
        }
        else {
            System.out.println("Число не принадлежит к заданным диапазонам ");
        }
    }
}
