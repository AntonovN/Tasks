package com.company;
import java.util.Scanner;
public class Task_7 {
    public static void main(String[] args) {
        // write your code here
        int x, y, z;
        x = 3;
        y = 13;
        z = 0;
        Scanner in = new Scanner(System.in);
        System.out.print("Input number: ");
        int number = in.nextInt();

        if (number == x) {
            System.out.println("это чисто есть в константе");
        } else if (number == y) {
            System.out.println("это чисто есть в константе");
        } else if (number == z) {
            System.out.println("это чисто есть в константе");
        } else {
            System.out.println("net takogo chisla v konstante");
        }
    }
}

