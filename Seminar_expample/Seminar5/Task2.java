// Task_2

// Вводится число n, затем n целых чисел.
// Для каждого числа выведите слово YES (в отдельной строке), 
//если это число ранее встречалось в последовательности или NO, если не встречалось.

// Sample Input:
// 6
// 1 2 3 2 3 4

// Sample Output:
// NO
// NO
// NO
// YES
// YES
// NO

package Seminar_expample.Seminar5;

import java.util.Scanner;
import java.util.HashSet;

public class Task2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input n");
        int n = sc.nextInt();
        HashSet<Integer> set1 = new HashSet<Integer>();
        int i = 0;
        while (i < n) {
            int value = sc.nextInt();
            if (set1.add(value) == true) {
                System.out.println("YES");
            } else {
                System.out.println("NO");

            }
            i++;
        }

    }

}
