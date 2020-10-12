package com.company;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


public class finaltask_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Задание длинны массива");
        int size = sc.nextInt();
        int unsort[] = new int[size];
        System.out.println("Сам массив: ");

        for (int i = 0; i < unsort.length; i++) {
            unsort[i] = random.nextInt(15);
            System.out.print(" " + unsort[i]);
        }
        System.out.println();
        insertIntoSort(unsort);
    }

    public static void insertIntoSort(int[] sort) {
        int temp, j;
        for (int i = 0; i < sort.length - 1; i++) {
            if (sort[i] > sort[i + 1]) {
                temp = sort[i + 1];
                sort[i + 1] = sort[i];
                j = i;
                while (j > 0 && temp < sort[j - 1]) {
                    sort[j] = sort[j - 1];
                    j--;
                }
                sort[j] = temp;
            }
        }
        System.out.println("отсортированный массив: ");
        System.out.println(Arrays.toString(sort));
    }
}