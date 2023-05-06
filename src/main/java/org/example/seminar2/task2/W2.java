package org.example.seminar2.task2;

import java.util.Scanner;

//2) Дана последовательность из N целых чисел. Верно ли, что последовательность является возрастающей.
public class W2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности: ");
        int n = scanner.nextInt();
        System.out.println(checkSeq(n, scanner));
        scanner.close();
    }

    public static boolean checkSeq(int n, Scanner scanner) {
        int res = 0;
        int a = scanner.nextInt();
        for (int i = 1; i < n; i++) {
            int b = scanner.nextInt();
            if (a > b) {
                res += 1;
            }
            a = b;
        }
        if (res > 0) return false;
        else return true;
    }
}
