package org.example.seminar2.task1;

import java.util.Scanner;

//1) Дана последовательность N целых чисел. Найти сумму простых чисел.
public class W1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите количество чисел в последовательности: ");
        int n = scanner.nextInt();
        System.out.println(sumPrimeNum(n, scanner));
        scanner.close();
    }

    public static int sumPrimeNum(int n, Scanner scanner) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            int a = scanner.nextInt();
            if (isPrime(a)) {
                sum += a;
            }

        }

        return sum;
    }

    public static boolean isPrime(int a) {
        if (a == 1 || a == 0||a<0) {
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
