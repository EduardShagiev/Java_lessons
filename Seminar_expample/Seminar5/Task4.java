// Вам дан массив путей, где пути[i] = [”Город А”, “Город Б”] означают, что существует прямой путь, идущий от
// ”Город А” до“Город Б”. Верните город назначения, то есть город без какого-либо пути, ведущего в другой город.
// Пример 1: Input: s = [["Москва","Самара"], ["Курск","Пенза"],["Самара","Курск"]]  Output: Пенза
// Пример 2: Input: s = [["Москва","Самара"]]  Output: Самара 
package Seminar_expample.Seminar5;

import java.util.HashMap;

public class Task4 {
    public static void main(String[] args) {
        HashMap<String, String> map1 = new HashMap<String, String>();

        map1.put("Москва", "Самара");
        map1.put("Курск", "Пенза");
        map1.put("Самара", "Курск");

        String finalycity = "";
        for (var item : map1.entrySet()) {
            String city = item.getValue();
            if (!map1.containsKey(city))
                finalycity = city;
        }
        System.out.println(finalycity);
    }
}
