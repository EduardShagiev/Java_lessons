// Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']',
// определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая
// закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false
package Home_work.HW_4;

import java.util.ArrayDeque;
import java.util.Scanner;
import java.util.Deque;
import java.util.Stack;
import java.util.*;;

public class Task3 {

    // public static void main(String[] args) {

    // Scanner sc = new Scanner(System.in);
    // String[] str = sc.next().split("");
    // Deque<String> deq1 = new ArrayDeque<String>();
    // for (int i = 0; i < str.length; i++) {
    // deq1.add(str[i]);
    // }
    // System.out.println(deq1);
    // }
    public static void main(String[] args) {
        Stack<Character> stack = new Stack<Character>();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] text = str.toCharArray();

        boolean res = true;

        for (int i = 0; i < text.length; i++) {
            char symbol = text[i];
            if (symbol == '(' || symbol == '{' || symbol == '[')
                stack.push(symbol);
            else if (symbol == ']') {
                if (stack.empty() || stack.pop() != '[')
                    res = false;
            } else if (symbol == '}') {
                if (stack.empty() || stack.pop() != '{')
                    res = false;
            } else if (symbol == ')') {
                if (stack.empty() || stack.pop() != '(')
                    res = false;
            }
        }
        System.out.println(res);
    }
}
