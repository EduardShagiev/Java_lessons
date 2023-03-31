package Seminar_expample.Seminar2;

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner IScanner = new Scanner(System.in);
        // System.out.printf("Введите строку");
        String str = ("Good morning my dear friend. My fish").toLowerCase();
        String[] words = str.split(" ");
        System.out.printf("Введите символ: ");
        char symbol = IScanner.next().charAt(0);

        int i = 0, j = 0;

        for (String word : words) {
            System.out.println(word);
        }
        for (int k = 0; k < str.length(); k++) {
            if (str.charAt(k) == symbol) {
                j++;
            }
        }
        System.out.println(j);
    }
}
