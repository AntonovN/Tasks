package com.company;

import java.util.Scanner;

public class Task_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите строку 1");
        String str = sc.nextLine();
        System.out.println("Введите строку 2");
        String str2 = sc.nextLine();
        if (str.length() > str2.length()) {
            System.out.println(str);
        }
        if (str.length() < str2.length()) {
            System.out.println(str2);
        } else if (str.equals(str2)) {
            System.out.println("Строки иммеют одинаковую длину ");
        }
    }
}
