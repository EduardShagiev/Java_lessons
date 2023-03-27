package Lessons_sample;

import java.io.FileWriter;
import java.io.IOException;

public class test2 {

    public static void main(String[] args) {
        long time = System.currentTimeMillis();
        try (FileWriter f1 = new FileWriter("file2.txt", false)) {

            // StringBuilder sb = new StringBuilder();
            String stroka = "";
            for (int i = 0; i < 1000000; i++) {
                // System.out.println("+");
                f1.write("+");
                // sb.append("+");
            }
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        System.out.println(System.currentTimeMillis() - time);
    }
}
