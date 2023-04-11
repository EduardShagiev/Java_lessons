// Даны два Deque представляющие два неотрицательных целых числа. Цифры хранятся
// в обратном порядке,
// и каждый из их узлов содержит одну цифру.
// Сложите два числа и верните сумму в виде связанного списка.

package Home_work.HW_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;

public class Task2 {
    public static void main(String[] args) {
        Deque<Integer> d1 = new ArrayDeque<>(Arrays.asList(1, 2, 3));
        Deque<Integer> d2 = new ArrayDeque<>(Arrays.asList(5, 4, 7));
        LinkedList<Integer> list1 = new LinkedList<Integer>();
        String str1 = new String(), str2 = new String();
        int sized1 = d1.size(), sized2 = d2.size();
        for (int i = 0; i < sized1; i++) {
            str1 += d1.pollLast();
        }
        for (int i = 0; i < sized2; i++) {
            str2 += d2.pollLast();
        }
        int summ = Integer.parseInt(str1) + Integer.parseInt(str2);
        while (summ > 0) {
            list1.add(summ % 10);
            summ = summ / 10;
        }
        System.out.println(list1);
    }
}