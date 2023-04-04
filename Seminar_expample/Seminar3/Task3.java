package Seminar_expample.Seminar3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner is = new Scanner(System.in);
        int n = is.nextInt();
        List<String> list1 = new ArrayList<String>();
        for (int i = 0; i < n; i++) {
            String p = Integer.toString(i);
            list1.add(p);
        }
        System.out.println(list1);
        is.nextLine();
        int m = is.nextInt();
        is.nextLine();
        if (m <= n) {
            String str = is.next();
            list1.add(m, str);
        }
        System.out.println(list1);
    }
}
