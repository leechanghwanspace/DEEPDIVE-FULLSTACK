package assignment.CartApp.app;


import assignment.CartApp.model.Product;
import assignment.CartApp.service.Cart;
import assignment.CartApp.service.ProductLoader;

import java.util.HashSet;
import java.util.Set;

public class CartApp {
    public static void main(String[] args) {

        // CSV 파일로부터 상품 목록 불러오기
        String csvFilePath = "products.csv";
        Set<Product> productSet = ProductLoader.loadProductsFromCSV(csvFilePath);

        // 상품 목록 확인
        System.out.println("===========================");
        System.out.println("***상품 판매 목록*** ");
        for (Product product : productSet) {
            System.out.println(product.getName() + " : " + product.getPrice() + "원");
        }

        // 장바구니 생성
        Cart myCart = new Cart();

        // 상품을 장바구니에 추가
        myCart.addProduct(new Product("P001", "IPhone 16", 1500000), 1);
        myCart.addProduct(new Product("P002", "IPhone 16 pro", 1800000), 1);
        myCart.addProduct(new Product("P018", "AirPods pro 2", 300000), 1);

        // 상품을 장바구니에서 제거
        myCart.removeProduct(new Product("P001", "IPhone 16", 1500000), 1);

        // 장바구니에 현재 담긴 상품들을 출력
        myCart.showItems();
    }
}