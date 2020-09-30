package com.company;

import java.util.Scanner;

public class finaltask_1 {
    public static void main(String[] args) {
        int num, decimal = 0, i=0;

        Scanner in = new Scanner(System.in);
        System.out.println("Введите бинарное число: ");
        String binary = in.nextLine();
        num = Integer.parseInt(binary);

        while(num != 0){
            decimal += (num%10)*Math.pow(2, i);
            num = num /10;
            i++;
        }

        System.out.println("Десятичное число : "+ decimal);

    }
}
