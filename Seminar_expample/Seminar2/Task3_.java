//проверка  ip adress
package Seminar_expample.Seminar2;

import java.util.Scanner;

public class Task3_ {
    public static void main(String[] args) {
        Scanner IScanner = new Scanner(System.in);
        System.out.println("Введите строку");
        String ipAdress = IScanner.next();
        System.out.println(ipAdress.length());
        String[] words = ipAdress.split("\\.");
        System.out.println(words.length);
        int[] arr = new int[words.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(words[i]);
        }

        if (words.length == 4) {

            for (int i = 0; i < arr.length; i++) {

                if (arr[i] >= 0 & arr[i] <= 255) {

                    System.out.println("Yes");

                } else
                    System.out.println("NO");

            }
        } else
            System.out.println("NO");

    }
}
