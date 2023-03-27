// Task_3.
// Реализовать простой калькулятор (+,-,=,*), только с целыми числами.
package Home_work.HW_1;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Input a:");
        int a = iScanner.nextInt();
        System.out.printf("Input b:");
        int b = iScanner.nextInt();
        System.out.printf("Input symbol + or - or *:");
        String str = iScanner.next();
        switch (str) {
            case "+":
                System.out.println(summa(a, b));
                break;
            case "-":
                System.out.println(minus(a, b));
                break;
            case "*":
                System.out.println(multi(a, b));
                break;
            default:
                System.out.println("Error");
                break;
        }
    }

    public static int summa(int a, int b) {
        return a + b;

    }

    public static int minus(int a, int b) {
        return a - b;
    }

    public static int multi(int a, int b) {
        return a * b;
    }
}
