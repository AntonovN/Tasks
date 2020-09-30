package com.company;

import java.io.*;


public class Task_18 {

    public static void main(String[] args) throws IOException {

        String s;

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {
            while ((s = br.readLine()) != null) {

                System.out.println(s); // вывод содежимиого файла

                String[] stringArray = s.split("/r/n"); // запись строк в массив
                System.out.println(stringArray.length); // вывод на экран количества строк в файле


                BufferedReader brr = new BufferedReader(new InputStreamReader(System.in));
                System.out.println("Признак конца ввода - строка 'stop' ");

                try (FileWriter fw = new FileWriter("test.txt")) {
                    for (int i = 0; i <= stringArray.length; i++) {
                        System.out.print(": ");
                        s = brr.readLine();
                        s = s + "/r/n";

                        fw.write(s);
                    }
                }
            }
        }

    }
}


