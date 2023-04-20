package OOP.Home_Work.HW_1.Products;

import javax.management.loading.PrivateClassLoader;

/**
 * Класс продукта Горячий напиток
 */
public class HotDrink extends Product {
    /** температура продукта */
    int temperature;
    /** Объем продукта в мл */
    int volume;

    /**
     * конструктор Горячий напиток 4 параметра
     * 
     * @param name        наименование продукта
     * @param price       цена продукта
     * @param volume      объем продукта
     * @param temperature температура продукта
     */
    public HotDrink(String name, Double price, int volume, int temperature) {
        super(name, price);
        this.volume = volume;
        this.temperature = temperature;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public int getTemperature() {
        return temperature;
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
                ", Температура=" + temperature +
                '}';
    }

}
