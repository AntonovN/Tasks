package com.company;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        int x, y, z;
        x = 3;
        y = 13;
        z = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();

        if (x == number || y == number || z == number) {
            System.out.println("это чисто есть в константе");
        } else {
            System.out.println("нет такого числа в константе");
        }

    }
}

