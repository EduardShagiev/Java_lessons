package OOP.Classes.Temp;

/**
 * Это Точка 2D
 */
public class point {
    private int x, y;

    /**
     * Это конструтктор
     * 
     * @param x Координата X
     * @param y Координата Y
     */

    public point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    // public point(int value) {
    // x = value;
    // y = value;
    // }

    // public point() {
    // x = 0;
    // y = 0;
    // }
    public point(int value) {
        this(value, value);
    }

    public point() {
        this(0);
    }

    private String getinfo() {
        return String.format("x=%d y=%d", x, y);
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int value) {
        this.x = value;
    }

    public void setY(int value) {
        this.y = value;
    }

    public static double distance(point a, point b) {
        return Math.sqrt(Math.pow(a.x - b.x, 2) + Math.pow(a.y - b.y, 2));
    }

    @Override
    public String toString() {
        return getinfo();
    }
}
