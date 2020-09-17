package com.company;

import java.util.Scanner;

public class Task_12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку с пробелами: ");
        String str = sc.nextLine();

        char[] chArray = str.toCharArray();
        for (int i = 0; i < chArray.length; i++) {
            if (chArray[i] == ' ') {
                chArray[i] = 0;

            }

        }
        System.out.println(chArray);
    }
}

