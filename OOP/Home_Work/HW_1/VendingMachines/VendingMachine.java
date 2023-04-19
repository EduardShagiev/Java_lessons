package OOP.Home_Work.HW_1.VendingMachines;

import OOP.Home_Work.HW_1.Products.Product;
import java.util.ArrayList;
import java.util.List;

public class VendingMachine {

    private int volume;
    private List<Product> products;// = new ArrayList<Product>();
    private List<String> workLog;// = new ArrayList<String>();

    public VendingMachine(int volume) {
        this.volume = volume;
        products = new ArrayList<Product>();
        workLog = new ArrayList<String>();
    }

    public void addProduct(Product prod) {
        products.add(prod);
    }

    public void addSales(String line) {
        workLog.add(line);
    }

    public Product getProdByName(String name) {
        for (Product prod : products) {
            if (prod.getName().contains(name)) {
                return prod;
            }
        }
        return null;
    }

    public List<Product> getProdAll() {
        return products;
    }

}