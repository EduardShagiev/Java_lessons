
// Task_1.
// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. 
//Затем вводятся 2 числа из этого диапазона. Используя данные из массива найдите их кубы.
// Sample Input:
// 8
// 11
// Sample Output:
// 512
// 1331

package Home_work.HW_1;

import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {

        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input val1:");
        double val1 = iScanner.nextDouble();
        System.out.printf("Input val2:");
        double val2 = iScanner.nextDouble();

        double[] arr = new double[1001];
        for (int i = 0; i <= 1000; i++) {
            arr[i] = Math.pow(i, 3);
        }

        for (int i = 0; i < arr.length; i++) {
            if (Math.pow(val1, 3) == arr[i]) {
                System.out.println(arr[i]);
            }
            if (Math.pow(val2, 3) == arr[i]) {
                System.out.println(arr[i]);
            }
        }
    }
}
