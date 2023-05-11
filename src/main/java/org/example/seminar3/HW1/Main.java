package org.example.seminar3.HW1;


import java.util.List;

import static org.example.seminar3.HW1.Product.getProducts;


public class Main {
    public static void main(String[] args) {

        List<Product> productList = getProducts();
        System.out.println(productList);
        Integer maxPriceFirst = 0;
        Integer maxPriceSecond = 0;
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).name.contains("premium")) {
                if (productList.get(i).grade.equals("first")) {
                    if (maxPriceFirst < productList.get(i).price) {
                        maxPriceFirst = productList.get(i).price;
                    }
                } else if (productList.get(i).grade.equals("second")) {
                    if (maxPriceSecond < productList.get(i).price) {
                        maxPriceSecond = productList.get(i).price;
                    }
                }
            }

        }
        System.out.println("Максимальная цена первого сорта = " + maxPriceFirst);
        System.out.println("Максимальная цена второго сорта = " + maxPriceSecond);

    }


}