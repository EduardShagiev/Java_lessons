package OOP.Home_Work.HW_1.Products;

public class BottleOfWater extends Product {

    private int volume;

    public BottleOfWater(String name, double price, int volume) {
        super(name, price);
        this.volume = volume;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    /**
     * переопределение вывода продукта
     */
    @Override
    public String toString() {
        return "Продукт{" +
                "Наименование='" + super.getName() + '\'' +
                ", Цена=" + super.getPrice() +
                ", Объем=" + volume +
                '}';
    }

}
