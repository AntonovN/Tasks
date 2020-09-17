package com.company;

import java.util.Scanner;
import java.util.Random;

public class Task_15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Задание длинны массива");
        int size = sc.nextInt();
        int myArray[] = new int[size];
        System.out.println("Рандомная вставка элементов + сам массив: ");

        for (int i = 0; i < size; i++) {
            myArray[i] = random.nextInt(15);
            System.out.print(" " + myArray[i]);
        }
        System.out.println();
        System.out.println("Отсортированный массив: ");
        for (int i = 0; i < size; i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (myArray[i] > myArray[j]) {
                    int temp = myArray[i];
                    myArray[i] = myArray[j];
                    myArray[j] = temp;
                }
            }
            System.out.print(" " + myArray[i]);

        }

    }
}
