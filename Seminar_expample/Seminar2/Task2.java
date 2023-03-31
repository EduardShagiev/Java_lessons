// Формат входных данных. 
// на первой строке вводится любимая буква Маши, на второй - Олега. Затем 
// вводится строка , в котрой перечислены слова , которые написаны в газете.
// Формат выходных данных
// // На первой строке выведите , сколько слов выписала Маша, а на второй - сколько слов выписал Олег
// Sample input:
// a B
// Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
// Sample Output
// 7
// 5 

package Seminar_expample.Seminar2;

public class Task2 {
    public static void main(String[] args) {
        String str = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
        String masha = "а";
        String oleg = "в";
        String[] words = str.split(" ");
        for (String word : words) {
            System.out.println(word);
        }
        int p = 0;
        int z = 0;
        for (int k = 0; k < words.length; k++) {

            if (words[k].contains(masha)) {
                p++;
            }
            if (words[k].contains(oleg)) {
                z++;
            }
        }
        System.out.println(p);
        System.out.println(z);
    }
}
