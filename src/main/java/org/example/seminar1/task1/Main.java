package org.example.seminar1.task1;

public class Main {
    public static void main(String[] args) {
        System.out.println(reverseWords("Hello , my world!"));
    }


    /**
     *
     * @param str изначальная строка
     * @return строку со словами в обратном порядке
     */
    public static String reverseWords(String str) {
        String[] words = str.split(" ");
        String res = "";
        for (int i = words.length-1; i >= 0; i--) {
            res = res + " " + words[i];
        }
        return res.trim();

    }
}