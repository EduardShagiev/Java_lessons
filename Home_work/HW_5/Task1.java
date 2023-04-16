package Home_work.HW_5;

import java.util.HashMap;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task1 {

    // return result;
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        HashMap<String, List<String>> phonebook1 = new HashMap<>();
        System.out.println("Введите кол-во абонетов");
        int t = sc.nextInt();
        for (int i = 0; i < t; i++) {
            System.out.println("Введите имя абонента");
            String str = sc.next();
            System.out.println("Введите кол-во номеров");
            int n = sc.nextInt();
            sc.nextLine();
            List<String> number = new ArrayList<String>();
            for (int j = 0; j < n; j++) {
                String phone = sc.nextLine();
                number.add(phone);
            }

            phonebook1.put(str, number);
        }
        System.out.println(phonebook1);
    }
}
