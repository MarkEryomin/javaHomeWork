package org.example.seminar3.HW3;


import java.util.ArrayList;
import java.util.List;

import static org.example.seminar3.HW3.Library.getBook;

public class Main {
    public static void main(String[] args) {
        List<Library> bookList = getBook();
        System.out.println(bookList);
        List<String> bookNames = new ArrayList<>();
        for (int i = 0; i < bookList.size(); i++) {
            if ((bookList.get(i).authorLastName.contains("A")) &&
                    ((bookList.get(i).year) >= 2010) &&
                    (isPrime(bookList.get(i).pages))) {
                bookNames.add(bookList.get(i).name);
            }
        }
        System.out.println(bookNames);
    }

    public static boolean isPrime(Integer a) {
        if (a == 1 || a == 0 || a < 0) {
            return false;
        }
        for (int i = 2; i * i <= a; i++) {
            if (a % i == 0) {
                return false;
            }
        }
        return true;
    }


}
