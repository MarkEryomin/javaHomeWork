package org.example.seminar3.HW2;

import org.example.seminar3.HW1.Product;

import java.util.ArrayList;
import java.util.List;

public class Prod {
    String name;
    String country;
    Double weight;
    Double price;
    String grade;

    public Prod(String name, String country, Double weight, Double price, String grade) {
        this.name = name;
        this.country = country;
        this.weight = weight;
        this.price = price;
        this.grade = grade;
    }

    public static List<Prod> getProd() {
        ArrayList<Prod> products = new ArrayList<>();
        products.add(new Prod("rice1", "Russia", 100.5, 1.25, "first"));
        products.add(new Prod("rice2", "Russia", 100.5, 2.25, "second"));
        products.add(new Prod("rice3", "Russia", 100.5, 3.25, "first"));
        products.add(new Prod("millet1", "Russia", 100.5, 4.25, "second"));
        products.add(new Prod("millet2", "Russia", 100.5, 5.25, "first"));
        products.add(new Prod("millet3", "Russia", 100.5, 6.25, "second"));
        products.add(new Prod("peas1", "Russia", 100.5, 7.25, "second"));
        products.add(new Prod("peas2", "Russia", 100.5, 8.25, "first"));
        products.add(new Prod("peas3", "Russia", 100.5, 9.25, "second"));
        products.add(new Prod("nut1", "Russia", 100.5, 10.25, "first"));
        products.add(new Prod("nut2", "Russia", 100.5, 11.25, "second"));
        products.add(new Prod("nut3", "Russia", 100.5, 12.25, "first"));

        return products;
    }

    @Override
    public String toString() {
        return "Prod{" +
                "name='" + name + '\'' +
                ", country='" + country + '\'' +
                ", weight=" + weight +
                ", price=" + price +
                ", grade='" + grade + '\'' +
                '}';
    }
}