package assignment.CartApp.app;


import assignment.CartApp.model.Product;
import assignment.CartApp.service.Cart;

import java.util.HashSet;
import java.util.Set;

public class CartApp {
    public static void main(String[] args) {

// 상품 목록 생성
        Set<Product> productSet = new HashSet<>();
        productSet.add(new Product("A01", "IPhone 16", 1500000));
        productSet.add(new Product("A02", "IPhone 16 pro", 1800000));
        productSet.add(new Product("B01", "IPad pro 13", 1500000));
        productSet.add(new Product("B02", "IPad Air 5", 900000));
        productSet.add(new Product("C01", "AirPods pro 2", 300000));
        productSet.add(new Product("C02", "AirPods 4", 250000));

        // 상품 목록 확인
        System.out.println("===========================");
        System.out.println("***상품 판매 목록*** ");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice() + "원");
        }

        // 장바구니 생성
        Cart myCart = new Cart();

        // 상품을 장바구니에 추가
        myCart.addProduct(new Product("A01", "IPhone 16", 1500000), 1);
        myCart.addProduct(new Product("A02", "IPhone 16 pro", 1800000), 1);
        myCart.addProduct(new Product("C01", "AirPods pro 2", 300000), 1);

        // 상품을 장바구니에서 제거
        myCart.removeProduct(new Product("A01", "IPhone 16", 1500000), 1);

        // 장바구니에 현재 담긴 상품들을 출력
        myCart.showItems();
    }
}