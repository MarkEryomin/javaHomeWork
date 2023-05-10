package org.example.seminar3.HW2;


import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.example.seminar3.HW2.Prod.getProd;

public class Main {
    public static void main(String[] args) {
        List<Prod> productList = getProd();
        System.out.println(productList);
        Map<String, Double> gradeAndPrice = new HashMap<>();
        for (int i = 0; i < productList.size(); i++) {
            if (productList.get(i).grade.contains("first")) {
                gradeAndPrice.put((productList.get(i).name), (productList.get(i).price));
            }
        }
        System.out.println(gradeAndPrice);
    }
}
