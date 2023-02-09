package StoreTask;

import java.util.List;

public class Product extends Store {

    private List<Product> items;
    private double price;

    public Product(String storeName, List<Product> items, double price) {
        super(storeName);
        this.items = items;
        this.price = price;
    }

    public List<Product> getItems() {
        return items;
    }

    public void setItems(List<Product> items) {
        this.items = items;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{" +
                "items=" + items +
                ", price=" + price +
                "} " + super.toString();
    }
}
