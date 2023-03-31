//Дана строка, в кторой через пробел перечилсены цифры
// На следующей строке вводиться цифра.
// Определите индексы первого и последнего её вхождения 
//  4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
//  4

//  out 0 8

package Seminar_expample.Seminar2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {

        Scanner Iscanner = new Scanner(System.in);
        String str = "4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7";
        System.out.println("Введите число:");
        String value = Iscanner.nextLine();
        System.out.println(str.indexOf(value));
        System.out.println(str.lastIndexOf(value));
    }
}
