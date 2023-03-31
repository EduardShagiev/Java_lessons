// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”
package Home_work.HW_2;

public class Task0 {
    public static void main(String[] args) {

        String str = "aaaAbbbB";
        String jewels = "aB";
        int count = 0, count1 = 0;
        char[] tempstr = jewels.toCharArray();
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == tempstr[0]) {
                count++;
            }

            if (str.charAt(i) == tempstr[1]) {
                count1++;
            }
        }
        System.out.printf("a%dB%d", count, count1);
    }
}
