package Home_work.HW_4;

import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.NoSuchElementException;
import java.util.Scanner;

public class Task1 {

    // Дан Deque состоящий из последовательности цифр.
    // Необходимо проверить, что последовательность цифр является палиндромом
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] str = sc.next().split("");
        Deque<Integer> deq1 = new ArrayDeque<Integer>();
        int k = 0, count = 0;

        for (int i = 0; i < str.length; i++) {
            deq1.add(Integer.parseInt(str[i]));
        }
        while (k <= deq1.size()) {
            try {
                if (deq1.removeFirst() == deq1.removeLast()) {
                    count++;
                    k++;
                } else
                    k++;
            } catch (NoSuchElementException e) {
                System.out.println("Очередь пуста");
            }
        }
        if (count == k)
            System.out.println("Полиyдром");
        else
            System.out.println("Нет");
    }
}
