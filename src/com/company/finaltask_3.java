package com.company;

import java.util.Scanner;

public class finaltask_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите курс доллра: ");
        double usd = sc.nextDouble();
        System.out.println("Введите количество рублей: ");
        double rub = sc.nextDouble();
        double convertor = rub / usd;
        System.out.printf("%.2f \n", convertor);

    }
}
