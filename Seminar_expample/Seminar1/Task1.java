// Task_1
// Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров. На какой день улитка доползёт до вершины шеста?

// Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.

// Программа должна вывести одно натуральное число.

// Sample Input 1:

// 10
// 3
// 2

// Sample Output 1:

// 8

package Seminar_expample.Seminar1;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("H:");
        int h = iScanner.nextInt();
        System.out.printf("A:");
        int a = iScanner.nextInt();
        System.out.printf("B:");
        int b = iScanner.nextInt();

        int count = 1;
        while (h - a > 0) {
            h = h - a + b;
            count++;
        }
        System.out.print(count);

    }
}
