package assignment.CartApp.service;

import assignment.CartApp.model.Product;
import java.util.HashMap;
import java.util.Map;

public class Cart {
    private Map<Product, Integer> items;

    public Cart() {
        this.items = new HashMap<>();
    }

    public void addProduct(Product product, int quantity) {
        items.put(product, items.getOrDefault(product, 0) + quantity);
    }

    public void removeProduct(Product product, int quantity) {
        if (items.containsKey(product)) {
            int currentQuantity = items.get(product);
            if (currentQuantity <= quantity) {
                items.remove(product);
            } else {
                items.put(product, currentQuantity - quantity);
            }
        }
    }

    public void showItems() {
        if (items.isEmpty()) {
            System.out.println("===========================");
            System.out.println("장바구니가 비어 있습니다.");
            System.out.println("===========================");
        } else {
            System.out.println("===========================");
            System.out.println("***장바구니***");
            for (Map.Entry<Product, Integer> entry : items.entrySet()) {
                System.out.println(entry.getKey().getName() + " : " + entry.getValue() + "개");
            }
            System.out.println("===========================");
        }
    }
}
