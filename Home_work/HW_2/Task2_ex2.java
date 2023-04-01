package Home_work.HW_2;

public class Task2_ex2 {
    public static void main(String[] args) {
        int n = 2;
        String n1 = "Арахис 100гр, мороженое 200гр. Возьмите арахис и измелчите его. Посыпьте измельчённый арахис на мороженое.";
        String n2 = "Клубника 100гр, сгущенка 3кг. Смешать, есть) Радоваться жизни.";
        int m = 3;
        String m1 = "арахис - колбаса";
        String m2 = "клубника - вишня";
        String m3 = "сгущенка - молоко";
        String[] N1 = n1.split(" ");
        String[] N2 = n2.split(" ");
        String[] M1 = m1.split(" - ");
        String[] M2 = m2.split(" - ");
        String[] M3 = m3.split(" - ");
        // for (String s : N1){
        // System.out.printf(s);
        // }
        for (int i = 0; i < N1.length; i++) {
            if (N1[i].equalsIgnoreCase(M1[0])) {
                if (Character.isUpperCase(N1[i].charAt(0))) {
                    N1[i] = M1[1].substring(0, 1).toUpperCase() + M1[1].substring(1);
                } else {
                    N1[i] = M1[1];
                }
            }
            if (N1[i].equalsIgnoreCase(M2[0])) {
                if (Character.isUpperCase(N1[i].charAt(0))) {
                    N1[i] = M2[1].substring(0, 1).toUpperCase() + M2[1].substring(1);
                } else {
                    N1[i] = M2[1];
                }
            }
            if (N1[i].equalsIgnoreCase(M3[0])) {
                if (Character.isUpperCase(N1[i].charAt(0))) {
                    N1[i] = M3[1].substring(0, 1).toUpperCase() + M3[1].substring(1);
                } else {
                    N1[i] = M3[1];
                }
            }
        }
        for (int j = 0; j < N2.length; j++) {
            if (N2[j].equalsIgnoreCase(M1[0])) {
                if (Character.isUpperCase(N2[j].charAt(0))) {
                    N2[j] = M1[1].substring(0, 1).toUpperCase() + M1[1].substring(1);
                } else {
                    N2[j] = M1[1];
                }
            }
            if (N2[j].equalsIgnoreCase(M2[0])) {
                if (Character.isUpperCase(N2[j].charAt(0))) {
                    N2[j] = M2[1].substring(0, 1).toUpperCase() + M2[1].substring(1);
                } else {
                    N2[j] = M2[1];
                }
            }
            if (N2[j].equalsIgnoreCase(M3[0])) {
                if (Character.isUpperCase(N2[j].charAt(0))) {
                    N2[j] = M3[1].substring(0, 1).toUpperCase() + M3[1].substring(1);
                } else {
                    N2[j] = M3[1];
                }
            }
        }
        for (String a : N1) {
            System.out.printf("%s ", a);
        }
        System.out.println();
        for (String b : N2) {
            System.out.printf("%s ", b);
        }
    }
}
