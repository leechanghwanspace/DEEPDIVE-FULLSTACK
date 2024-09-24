package assignment.CartApp.service;

import assignment.CartApp.model.Product;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class ProductLoader {

    public static Set<Product> loadProductsFromCSV(String fileName) {
        Set<Product> productSet = new HashSet<>();

        try {
            // CSV 파일을 클래스패스에서 불러오기
            InputStream inputStream = ProductLoader.class.getClassLoader().getResourceAsStream(fileName);
            if (inputStream == null) {
                throw new FileNotFoundException("CSV 파일을 찾을 수 없습니다.");
            }

            BufferedReader br = new BufferedReader(new InputStreamReader(inputStream));
            String line;
            while ((line = br.readLine()) != null) {
                String[] productInfo = line.split(",");
                if (productInfo.length == 3) {
                    String key = productInfo[0];
                    String name = productInfo[1];
                    double price = Double.parseDouble(productInfo[2]);

                    Product product = new Product(key, name, price);
                    productSet.add(product);
                }
            }

        } catch (Exception e) {
            System.err.println("CSV 파일을 읽는 중 오류가 발생했습니다: " + e.getMessage());
        }

        return productSet;
    }
}
