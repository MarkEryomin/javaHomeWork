package org.example.seminar1.task2;

import java.util.Scanner;

public class HW2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        System.out.println(resSum(a, scanner));
        scanner.close();
    }

    /**
     *
     * @param a первое число последовательности
     * @param scanner следующие числа последовательности
     * @return сумму положительных чисел , стоящих перед отрицательными числами
     */
    public static int resSum(int a, Scanner scanner) {

        int res = 0;
        while (a != 0) {
            int b = scanner.nextInt();
            if (a > 0 && b < 0) {
                res += a;
            }
            a = b;
        }
        return res;
    }
}
