package Seminar_expample.Seminar3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.ListIterator;
import java.util.Random;
import java.util.Scanner;

public class Task6 {

    public static List<Integer> REV(List<Integer> list) {
        ListIterator<Integer> col = list.listIterator();
        List<Integer> list2 = new ArrayList<>();

        while (col.hasNext()) {
            int value = col.next();
            if (value % 2 == 0) {
                list2.add(value);
            } else
                continue;
        }
        return new ArrayList<>(list2);
    }

    public static void main(String[] args) {

        List<Integer> list1 = new ArrayList<>();
        Random rand = new Random();

        for (int i = 0; i < 100; i++) {
            list1.add(rand.nextInt(100));
        }
        System.out.println(list1);

        System.out.print(REV(list1));

    }

}
