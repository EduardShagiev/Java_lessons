// Task_6
// Вводится массив (сначала количество элементов, потом сами элементы). 
//Найдите сумму его элементов с чётными индексами и выведите её. А потом выведите числа, которые суммировались.
// Sample Input:
// 4
// 1
// 2
// 3
// 4
// Sample Output:
// 4
// 1
// 3

package Seminar_expample.Seminar1;

import java.util.Scanner;

public class Task6 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input n:");
        int n = iScanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element Index[%d]:", i);
            arr[i] = iScanner.nextInt();
        }
        int summa = 0;
        for (int i = 0; i < arr.length; i += 2) {
            System.out.println(arr[i]);
            summa += arr[i];
        }
        System.out.printf("Summa odd = :%d ", summa);

    }

}
