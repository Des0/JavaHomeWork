package com.pb.Glotov.hw4;
import java.util.Arrays;
import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Введите первое предложение: ");
        String first = in.nextLine().toUpperCase();


        System.out.print("Введите второе предложение: ");
        String second = in.nextLine().toUpperCase();

        String result = isAnagram(first, second);
        System.out.println(result);
    }

    public static String isAnagram(String first, String second) {
        if (first == null || second == null || first.equals("") || second.equals("") || !first.matches("[A-Za-z-яёА-Яё,. ]+")
                || !second.matches("[A-Za-z-яёА-Яё,. ]+")) {
            return "Это не анаграмма.";
        }
        String answer = "";

        String st = first.replaceAll("[,. ]+", "");
        String nd = second.replaceAll("[,. ]+", "");

        if (st.equals("") || nd.equals("")) {
            return "Это не анаграмма.";
        }

        char[] arraySt = st.toCharArray();
        char[] arrayNd = nd.toCharArray();
        Arrays.sort(arraySt);
        Arrays.sort(arrayNd);

        if (Arrays.equals(arraySt, arrayNd)) {
            answer = "Это анаграмма.";
        } else {
            answer = "Это не анаграмма.";
        }
        return answer;
    }
}
