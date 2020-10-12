package com.company;

import java.io.*;
import java.util.Scanner;


public class Task_18 {

    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("test.txt"); // инициализация reader
        Scanner scan = new Scanner(fr);
        int i = 1;
        System.out.println("содержимое файла");
        while (scan.hasNextLine()) {
            System.out.println(i + " : " + scan.nextLine());
            i++;
        }
        fr.close(); // закрыли поток для reader
        System.out.println("введите новые строки");
        FileWriter fw = new FileWriter("test.txt"); // инициализация writer
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int j = (i - 1); j > 0; j--) {
            fw.write(reader.readLine() + "\n");
        }
        System.out.println("строки перезаписаны");

        fw.close();

    }
}


