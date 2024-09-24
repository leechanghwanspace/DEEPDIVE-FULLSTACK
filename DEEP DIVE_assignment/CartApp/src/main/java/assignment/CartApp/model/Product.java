package assignment.CartApp.model;

import java.util.Objects;

public class Product {
    private String key;
    private String name;
    private double price;

    public Product(String key, String name, double price) {
        this.key = key;
        this.name = name;
        this.price = price;
    }

    public String getKey() {
        return key;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Product product = (Product) o;
        return Objects.equals(key, product.key);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key);
    }
}
