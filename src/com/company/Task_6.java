package com.company;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Input x number: ");
        int x = in.nextInt();
        System.out.print("Input y number: ");
        int y = in.nextInt();
        System.out.print("Input z number: ");
        int z = in.nextInt();

        double res = (x * y * z) / 3;


        System.out.println(res);

        int res2 = (int) res / 2;
        System.out.println(res2);

        if (res2 > 3) {
            System.out.println("Программа выполнена корректно");
        }


    }


}

