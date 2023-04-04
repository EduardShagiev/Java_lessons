package Seminar_expample.Seminar3;

import java.util.*;;

public class Task1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();
        list.add("Red");
        list.add("Green");
        list.add("Yellow");
        list.add("Black");
        System.out.println(list);
        list.set(3, "Blue");
        System.out.println(list);

        if (list.contains("Red")) {
            System.out.printf("Элемент есть в списке c инедксом\n");
        } else
            System.out.println("No");

        System.out.println(list.indexOf("Blue"));

        List<Integer> list2 = new LinkedList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        System.out.println(list2);
    }
}
