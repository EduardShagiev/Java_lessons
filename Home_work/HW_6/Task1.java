package Home_work.HW_6;

public class Task1 {
    public static void main(String[] args) {
        laptop LP1 = new laptop("Asus", "MTG100", 123456, 16, 512, "RX4600", "Windwos");
        laptop LP2 = new laptop("Lenovo", "Legion100", 412345, 32, 512, "RX2600", "Not");
        laptop LP3 = new laptop("Asus", "MTG200", 567889, 16, 1024, "RX3700", "Linux");

        LP1.getAllInf();
        // LP2.getAllInf();
        // LP3.getAllInf();
        LP1.setfilter();
    }
}
