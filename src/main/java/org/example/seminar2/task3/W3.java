package org.example.seminar2.task3;

import java.util.Arrays;
import java.util.Scanner;

//Дан массив целых чисел. Заменить отрицательные элементы на сумму индексов двузначных элементов массива.
public class W3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива : ");
        int n = scanner.nextInt();
        System.out.println(Arrays.toString(enterArray(n, scanner)));
        scanner.close();
    }

    public static int[] enterArray(int n, Scanner scanner) {
        int sumIndex=0;
        int[] myArray=new int[n];
        for (int i = 0; i < n; i++) {
            myArray[i]=scanner.nextInt();
            if(Math.abs(myArray[i])>9&&Math.abs(myArray[i])<100){
                sumIndex+=i;
            }
        }
        for (int i = 0; i < n; i++){
            if (myArray[i]<0){
                myArray[i]=sumIndex;
            }
        }

        return myArray;
    }

}
