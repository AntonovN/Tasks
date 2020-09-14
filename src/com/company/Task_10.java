package com.company;

import java.util.Scanner;

public class Task_10 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("введите размер массива: ");
    int size = input.nextInt();
    int size2 = input.nextInt();
    int array[][] = new int[size][size2];
        System.out.println("Введите элементы массива: ");
        for (int i = 0; i < size; i++) {
        for (int j = 0; j < size2; j++) {
            array[i][j] = input.nextInt();
        }
    }
        System.out.println("Ваша матрица "); //вывод на экран матрицы
        for (int i = 0; i < array.length; i++) {
        for (int j = 0; j < array[i].length; j++) {
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }
        System.out.println("только первая строка ");
        for (int i = 0; i < size - (size - 1); i++) {
        for (int j = 0; j < array[i].length; j++) {
            array[i][j] = array[i][j] * 3; // умножаем каждый элемент первой строки на 3
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }
}
}

