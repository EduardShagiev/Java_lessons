package OOP.Home_Work.HW_1;

import OOP.Home_Work.HW_1.Products.BottleOfWater;
import OOP.Home_Work.HW_1.Products.HotDrink;
import OOP.Home_Work.HW_1.Products.Product;
import OOP.Home_Work.HW_1.VendingMachines.VendingMachine;

public class App {
    public static void main(String[] args) throws Exception {

        Product item1 = new Product("Cola", 88.0);
        item1.setPrice(99.0);

        VendingMachine itemMachin = new VendingMachine(300);
        itemMachin.addProduct(item1);
        itemMachin.addProduct(new Product("Чипсы", 60.0));
        itemMachin.addProduct(new Product("Масло", 50.0));
        itemMachin.addProduct(new Product("Хлеб", 40.0));
        itemMachin.addProduct(new Product("Снек", 20.0));
        itemMachin.addProduct(new BottleOfWater("Cola", 88.0, 500));
        itemMachin.addProduct(new BottleOfWater("Water", 188.0, 1500));
        itemMachin.addProduct(new HotDrink("Капучино", 150.0, 300, 75));
        itemMachin.addProduct(new HotDrink("Латте", 120.0, 300, 80));
        itemMachin.addProduct(new HotDrink("Чай", 100.0, 200, 90));

        // System.out.println(itemMachin.getProdByName("Масло"));

        for (Product prod : itemMachin.getProdAll()) {
            System.out.println(prod.toString());
        }

    }
}