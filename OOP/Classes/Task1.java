package OOP.Classes;

public class Task1 {
    public static void main(String[] args) {
        point mupoint = new point(3, 6);
        System.out.println(mupoint);
        point a = new point(10, 20);
        point b = new point(40, 60);
        var dis = point.distance(a, b);
        System.out.println(dis);

    }

}
