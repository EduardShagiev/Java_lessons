//Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
package Home_work.HW_3;

import java.util.List;
import java.util.Random;
import java.util.ArrayList;
import java.util.Collections;

public class Task3 {
    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 20; i++) {
            list1.add(rand.nextInt(100));
        }
        System.out.println(list1);
        System.out.println("Мин=" + Collections.min(list1));
        System.out.println("Макс=" + Collections.max(list1));
        long sum = 0;
        for (Integer item : list1) {
            sum += item;
        }
        System.out.println("Avg=" + (double) sum / list1.size());
    }

}
