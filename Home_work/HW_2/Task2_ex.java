package Home_work.HW_2;

import java.util.*;

public class Task2_ex {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.printf("Количество строк в книге: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        List<String> book = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.printf("Рецепт %d: \n", i + 1);
            book.add(scanner.nextLine());
        }

        System.out.printf("Количество замен: ");
        int m = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите замену используя формат: \"Старое значение\" - \"Новое значение\"");
        Map<String, String> replacements = new HashMap<>();
        for (int i = 0; i < m; i++) {
            String[] parts = scanner.nextLine().split(" - ");
            replacements.put(parts[0], parts[1]);
        }

        for (String line : book) {
            for (String product : replacements.keySet()) {
                String replacement = replacements.get(product);
                line = line.replaceAll("\\b" + product + "\\b", replacement);
                line = line.replaceAll("\\b" + capitalize(product) + "\\b", capitalize(replacement));
            }
            System.out.println(line);
        }
        scanner.close();
    }

    // Вспомогательная функция для приведения первой буквы слова к верхнему регистру
    private static String capitalize(String s) {
        return Character.toUpperCase(s.charAt(0)) + s.substring(1);
    }
}