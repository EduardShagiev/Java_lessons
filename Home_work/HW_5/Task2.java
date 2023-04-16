//Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
// Реализовать алгоритм пирамидальной сортировки (HeapSort).
package Home_work.HW_5;

import java.util.*;

public class Task2 {
    public static void main(String[] args) {

        HashMap<String, String> map1 = new HashMap<>();
        map1.put("Иванов", "Иван");
        map1.put("Петрова", "Светлана");
        map1.put("Белова", "Кристина");
        map1.put("Мусина", "Анна");
        map1.put("Крутова", "Анна");
        map1.put("Юрин", "Иван");
        map1.put("Лыков", "Петр");
        map1.put("Чернов", "Павел");
        map1.put("Чернышов", "Петр");
        map1.put("Федорова", "Мария");
        map1.put("Савина", "Мария");
        map1.put("Светлова", "Марина");
        map1.put("Рыкова", "Марина");
        map1.put("Владимирова", "Анна");
        map1.put("Мечников", "Иван");
        map1.put("Петин", "Петр");
        map1.put("Ежов", "Иван");

        List<String> listname = new ArrayList<>();
        for (var item : map1.values()) {
            listname.add(item);
        }
        System.out.println(listname);
        int count;
        Set<String> set1 = new HashSet<>();
        for (int i = 0; i < listname.size(); i++) {
            count = 0;
            for (int j = 0; j < listname.size(); j++) {
                if (listname.get(i) == listname.get(j)) {
                    count++;
                }

            }
            // System.out.printf("%s == %d ", listname.get(i), count);
            String temp = listname.get(i).concat("=").concat(Integer.toString(count));
            set1.add(temp);
        }
        System.out.println(set1);

    }
}
