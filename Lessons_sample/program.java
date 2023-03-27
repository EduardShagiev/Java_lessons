package Lessons_sample;

import java.util.Scanner;

public class program {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int k = scan.nextInt();
        boolean firstSign = false; // флаг печати знака суммы, печатаем + перед всеми символами, кроме первого
                                   // напечатанного
        for (int i = k; i > -1; i--) {
            int a = (int) (Math.random() * 100); // от 0 до 100
            if (a == 0) { // если коэффициент равен нулю, то ничего не печатаем
                continue;
            }
            if (firstSign)
                System.out.print(" + ");
            switch (i) {
                case 0:
                    System.out.print(a);
                    break;
                case 1:
                    System.out.print(a + "*x");
                    break;
                default:
                    System.out.print(a + "*x^" + i);
                    break;
            }
            firstSign = true;

        }
        System.out.print(" = 0");
        scan.close();
    }
}
