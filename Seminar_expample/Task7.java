//Task_7
// Дан список. Выведите те его элементы, которые встречаются в списке только один раз. Элементы нужно выводить
// в том порядке, в котором они встречаются в списке.
// Входные данные
// Вводится список чисел. Все числа списка находятся на одной строке.
// Выходные данные
// Выведите ответ на задачу.
// Sample Input:
// 6
// 1
// 2
// 2
// 3
// 3
// 3
// Sample Output:
// 1

package Seminar_expample;

import java.util.Scanner;

public class Task7 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input n:");
        int n = iScanner.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Element Index[%d]:", i);
            arr[i] = iScanner.nextInt();
        }
        for (int i = 0; i < arr.length; i++) {
            int cn = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    cn++;
                }

            }
            if (cn == 1)
                System.out.println(arr[i]);
        }

    }
}
