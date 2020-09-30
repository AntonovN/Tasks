package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.io.*;

public class Task_17 {
    public static void main(String[] args) {
        String s;
        BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Признак конца ввода - строка 'stop' ");

        try (FileWriter fw = new FileWriter("test.txt")) {
            do {
                System.out.print(": ");
                s = brr.readLine();
                if (s.compareTo("stop") == 0) break;
                s = s + "/r/n";

                fw.write(s);
            } while (s.compareTo("stop") != 0);
        } catch (IOException ex) {
            System.out.println("Ошибка ввода-вывода:" + ex);

        }
    }
}

