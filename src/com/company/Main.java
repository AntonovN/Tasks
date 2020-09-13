package com.company;
import java.util.Scanner;
// Task 4

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input binary number: ");
        String bin = sc.nextLine();
        int binNum = Integer.parseInt(bin, 2);

        System.out.println(binNum);
    }

}








