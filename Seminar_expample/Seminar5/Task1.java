
// Task_1

// Вводится число n, затем n целых чисел.
// Определите, сколько различных чисел было введено.

// Sample Input:
// 7
// 1 1 2 2 2 3 3

// Sample Output:
// 3
package Seminar_expample.Seminar5;

import java.util.HashSet;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n");
        int n = sc.nextInt();
        HashSet<Integer> set1 = new HashSet<Integer>();
        int i = 0;
        while (i < n) {
            int value = sc.nextInt();
            set1.add(value);
            i++;
        }

        System.out.println(set1.size());
    }

}
