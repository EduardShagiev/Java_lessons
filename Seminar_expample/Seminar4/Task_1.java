// Task1  Очередь
// Напишите программу, которая реализует структуры данных очередь, используя списки.
// Условие задачи таково: пользователь листает списки музыки и добавляет в плейлист 
// понравившиеся ему композиции. Когда песня доиграет , включается  следующая.
// Вам необходимо вывести на экран чререз пробел композиции, котрые будут играть далее.

// Сначала вводится число n - кол-во запросов  к вашей  программе. 
// Каждый из запроса будет иметь один следуюших видов. 
// push <Название трека> - добавляет трек в плейлист.
// pop - удаляет из плейлиста первой трек. При этом на экран выводится запись вида "воспроизводится название трека>"
// После выполнения всех запросов выведите оставшиеся в очериди треки. Гарантируется, что название трека состоит из одного слова 
//4
// push Trek1
// push Trek3
//pop 
//push ТрекТрек
//Sample
// воспроизвести Трек1
package Seminar_expample.Seminar4;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<String> queque1 = new ArrayList<String>();
        System.out.println("Введите число запросов");
        int n = sc.nextInt();
        sc.nextLine();
        int i = 0;
        String word = null;
        while (i != n) {
            System.out.println("Введите операцию");
            String[] operation = sc.nextLine().split(" ");

            switch (operation[0]) {
                case "push":
                    queque1.add(operation[1]);
                    i++;
                    break;
                case "pop":
                    word = queque1.get(0).toString();
                    queque1.remove(0);

                    i++;
                    break;

                default:
                    i++;
                    break;
            }
        }
        System.out.printf("Воспроизводится %s\n", word);
        for (String str : queque1) {
            System.out.println(str);
        }

    }
}
