package org.example.seminar3.HW4;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{2, 4, 57, 3, 27, 6, 45, 2, 746, 25, 64, 34, 75, 39, 12, 7, 32};
        ArrayList<Integer> numbers = new ArrayList<Integer>(List.of(arr));
        System.out.println(numbers);
        Collections.sort(numbers);
        System.out.println(numbers);
        System.out.printf("минимальный элемент : " + numbers.get(0));
        System.out.println();
        System.out.printf("максимальный элемент : " + numbers.get(numbers.size() - 1));
        System.out.println();
        System.out.printf("Среднее значение = " + "%.2f", (average(numbers)));
    }

    public static Double average(ArrayList<Integer> numbers) {
        Double averAr = 0.0;
        for (int i = 0; i < numbers.size(); i++) {
            averAr += numbers.get(i);
        }
        averAr = averAr / numbers.size();
        return averAr;
    }
}
