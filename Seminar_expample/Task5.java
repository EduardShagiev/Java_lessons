// Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c. Границы включаются.
// Входные данные
// Заданы три целых числа а, b, с, где a > b
// Выходные данные
// Выведите единственное число - ответ на задачу.
// Sample Input:
// 20
// 1
// 2
// Sample Output:
// 20
// 18
// 16
// 14
// 12
// 10
// 8
// 6
// 4
// 2

package Seminar_expample;

import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("a:");
        int a = iScanner.nextInt();
        System.out.printf("b:");
        int b = iScanner.nextInt();
        System.out.printf("c:");
        int c = iScanner.nextInt();
        int value = a;
        while (value >= b) {
            System.out.println(value);
            value = value - c;
        }
    }
}
