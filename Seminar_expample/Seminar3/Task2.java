
//Напишите программу, которая считает натурльное число n c клавиатуры и создает список, в которой первый и 
// последнний элемнты будут равны строчке 1, а между ними будет 0. Выведите список через пробел на экран
package Seminar_expample.Seminar3;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class Task2 {
    public static void main(String[] args) {
        Scanner iscanner = new Scanner(System.in);
        int n = iscanner.nextInt();
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        System.out.println(list1);

        for (int i = 0; i < n + 2; i++) {
            list1.add(i, 0);

        }
        list1.set(0, 1);
        list1.set(n + 1, 1);
        System.out.println(list1);
    }
}
