// Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n
// n! = 1∙2∙3∙…∙ n.
// Sample Input:
// 5
// Sample Output:
// 120

package Seminar_expample.Seminar1;

import java.util.Scanner;

import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class Task4 {

    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("n:=");
        int n = iScanner.nextInt();
        System.out.println(Fact(n));
    }

    public static long Fact(long n) {
        if (n == 0)
            return 1;
        else
            return n * Fact(n - 1);
    }

}
