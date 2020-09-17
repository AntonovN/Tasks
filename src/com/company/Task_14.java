package com.company;

import java.util.Scanner;

public class Task_14 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число: ");
        String s = sc.nextLine();
        Integer x = Integer.valueOf(s);
        double y = (double) x;
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);
    }
}
