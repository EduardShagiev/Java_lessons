
// Дана последовательность чисел. Необходимо вернуть число совпадающих пар в этой последовательности
// Пример 1:     In: arr = [1, 2]  Out: 0
// Пример 2:     In: arr = [1, 1, 2]  Out: 1
// Пример 3:     In: arr = [1, 1, 1, 2, 2]  Out: 4
package Seminar_expample.Seminar5;

import java.util.Scanner;
import java.util.HashSet;

public class Task3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n");
        int n = sc.nextInt();
        HashSet<Integer> set1 = new HashSet<Integer>();
        int i = 0;
        int count = 0;
        while (i < n) {
            int value = sc.nextInt();
            if (set1.add(value) == true) {
                // System.out.println("YES");

            } else {
                // System.out.println("NO");
                count++;

            }
            i++;
        }
        System.out.println(count);
    }

}