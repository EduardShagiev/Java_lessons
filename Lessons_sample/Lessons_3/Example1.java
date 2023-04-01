package Lessons_sample.Lessons_3;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example1 {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 12, 123, 1234, 12345);

        for (Integer integer : list) {
            System.out.println(integer);
        }
        // list.add(123456);
        Iterator<Integer> col = list.iterator();

        while (col.hasNext()) {
            System.out.println(col.next());
        }
    }
}
