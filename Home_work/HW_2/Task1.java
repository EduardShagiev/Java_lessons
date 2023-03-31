// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

package Home_work.HW_2;

public class Task1 {
    public static void main(String[] args) {
        String str = "cba";
        System.out.println(str.length());
        char[] word = new char[3];
        System.out.println(word.length);
        int[] index = new int[] { 3, 2, 1 };

        for (int i = 0; i < word.length; i++) {
            word[i] = str.charAt(index[i] - 1);
        }
        for (char j : word) {
            System.out.print(j);
        }
    }
}
