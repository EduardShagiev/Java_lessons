package Lessons_sample;

import java.util.regex.*;
import java.io.*;
import java.io.IOException;

public class workfile {
    // BufferedReader br = new BufferedReader(new FileReader("first_in.txt"));
    // String firstEx = br.readLine();
    // br.close();
    // br = new BufferedReader(new FileReader("second_in.txt"));
    // String secondEx = br.readLine();
    // br.close();
    // String[] inEx = {firstEx, secondEx};
    public static void main(String[] args) throws IOException {
        String[] inEx = {
                "42*x^10 + 57*x^9 + 9*x^8 + 58*x^7 + 72*x^6 + 82*x^5 + 99*x^4 + 88*x^3 + 68*x^2 + 32*x + 5 = 0",
                "-9*x^10 + 26*x^9 - 17*x^8 - 28*x^7 + 94*x^6 + 85*x^5 + 66*x^4 + 4*x^3 - 72*x^2 - 71*x + 51 = 0"
        };
        StringBuffer buffer = new StringBuffer();

        Pattern pattern = Pattern.compile("[+-]*\\s*[0-9]{1,}\\**[a-zA-Z]*\\^*[0-9]*");

        for (String ex : inEx) {
            Matcher matcher = pattern.matcher(ex);

            while (matcher.find()) {
                buffer.append(matcher.group().replace(" ", "").replace("+", "") + "|");
            }
        }
        String[] varArray = (buffer.toString()).split("\\|", 0);

        for (int i = 0; i < varArray.length; i++) {
            if (varArray[i] == "")
                continue;
            String curVar = GetVar(varArray[i]);
            for (int k = i + 1; k < varArray.length; k++) {
                String compVar = GetVar(varArray[k]);
                if (curVar.equals(compVar)) {
                    int newVal = GetVal(varArray[i]) + GetVal(varArray[k]);
                    varArray[i] = Integer.toString(newVal) + curVar;
                    varArray[k] = "";
                }
            }
        }

        StringBuffer result = new StringBuffer();
        boolean firstSign = false;
        for (String string : varArray) {
            if (string != "") {
                if (firstSign)
                    result.append(GetVal(string) > 0 ? "+" : "");
                result.append(string);
                firstSign = true;
            }

        }
        result.append(" = 0");
        System.out.print(result);

        try (FileWriter fw = new FileWriter("out.txt", false)) {
            fw.write(result.toString());
            fw.flush();
        } catch (IOException ex) {
            System.out.print(ex.getMessage());
        }

    }

    public static int GetVal(String exp) {
        if (exp.equals("0"))
            return 0;
        else {
            Pattern pattern = Pattern.compile("^-*[0-9]{1,}");
            Matcher matcher = pattern.matcher(exp);
            return matcher.find() ? Integer.parseInt(matcher.group()) : 1;
        }
    }

    public static String GetVar(String exp) {
        Pattern pattern = Pattern.compile("[a-zA-Z]{1,}\\^*[0-9]*");
        Matcher matcher = pattern.matcher(exp);
        return matcher.find() ? matcher.group() : "";
    }
}