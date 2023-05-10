package org.example.seminar3.HW1;

import java.util.ArrayList;
import java.util.List;

public class Product {
    String name;
    Integer price;
    String grade;

    @Override
    public String toString() {
        return "Product{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", grade='" + grade + '\'' +
                '}';
    }

    public Product(String name, Integer price, String grade) {
        this.name = name;
        this.price = price;
        this.grade = grade;
    }

    public static List<Product> getProducts() {
        ArrayList<Product> products = new ArrayList<>();
        products.add(new Product("premium rice", 120, "top"));
        products.add(new Product("premium rice", 100, "first"));
        products.add(new Product("premium rice", 80, "second"));
        products.add(new Product("millet", 60, "top"));
        products.add(new Product("premium millet", 50, "first"));
        products.add(new Product("millet", 40, "second"));
        products.add(new Product("rice", 100, "top"));
        products.add(new Product("rice", 85, "first"));
        products.add(new Product("premium rice", 68, "second"));
        products.add(new Product("millet", 60, "top"));
        products.add(new Product("millet", 50, "first"));
        products.add(new Product("premium millet", 40, "second"));
        return products;
    }
}


