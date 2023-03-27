package Lessons_sample;

import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.text.html.HTMLDocument.HTMLReader.IsindexAction;

public class prpgram2 {
    static int sum(int k, int j) {
        return k + j;

    }

    public static void main(String[] args) {
        System.out.println("world");
        int a = 123;
        System.out.println(a-- - a);
        int b = 8;
        System.out.println(b >> 1);
        int[] arr = new int[10];
        for (int i = 1; i < arr.length; i++) {
            arr[i] = i;
            System.out.println(arr[i]);
        }
        Scanner iScaner = new Scanner(System.in);
        System.out.printf("Name: ");
        String name = iScaner.nextLine();
        System.out.printf("Привет, %s", name);
        iScaner.close();

        System.out.printf("\n %d", sum(1, 5));

        try (FileWriter fw = new FileWriter("file.txt", false)) {
            fw.write("line 1");
            fw.append('\n');
            fw.append('2');
            fw.append('\n');
            fw.write("line 3");
            fw.append('\n');
            fw.write("hello world");
            fw.append('\n');
            fw.write(name);
            fw.flush();
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }

    }

}
