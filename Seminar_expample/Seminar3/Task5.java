package Seminar_expample.Seminar3;

import java.util.*;

import javax.print.attribute.IntegerSyntax;;

public class Task5 {
    private static boolean isDigit(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void main(String[] args) {
        List<String> list1 = new ArrayList(Arrays.asList("a", "9", "b", "6", "c", "3", "d", "7", "f"));
        System.out.println(list1);
        ListIterator<String> col = list1.listIterator();

        List<Integer> list2 = new ArrayList<Integer>();
        while (col.hasNext()) {
            String value = col.next();
            try {
                Integer.parseInt(value);
                System.out.println(value + "- Число");
            } catch (NumberFormatException e) {
                System.out.println(value + "- Строка");
            }
        }
    }
}
