package com.company;

import java.util.Scanner;

public class Task_9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Введите длину массива: ");
        int size = input.nextInt();
        int array[] = new int[size];
        System.out.println("Заполните массив элементами:");

        for (int i = 0; i < size; i++) {
            array[i] = input.nextInt();
        }
        System.out.print("Массив ");


        for (int i = 0; i < size; i++) {
            System.out.print(" " + array[i] * 2);
        }
        System.out.println();
    }
}

