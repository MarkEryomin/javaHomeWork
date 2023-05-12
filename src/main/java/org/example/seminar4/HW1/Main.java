package org.example.seminar4.HW1;


import java.util.Arrays;
import java.util.LinkedList;

//Вывести список на экран в перевернутом виде (без массивов и ArrayList)
//        Пример:
//        1 -> 2->3->4
//        Вывод:
//        4->3->2->1
public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(list);
        LinkedList<Integer> reversList = new LinkedList<>();
        while (list.size() > 0) {
            reversList.addFirst(list.pollFirst());
        }
        System.out.println("reversList = " + reversList);
    }

}



