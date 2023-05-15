package org.example.seminar5.HW1;


import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

// Подсчитать количество искомого слова, через map (наполнением значение,
// где искомое слово будет являться ключом), вносить все слова не нужно
public class Main {
    public static void main(String[] args) {
        String str = "Россия идет вперед всей планеты. Планета — это не Россия.";
        String find="Россия";
        System.out.println("количество совпадений "+find+" = " + fillMap(str,find));


    }


    public static Integer fillMap(String s,String f) {
        Map<String, Integer> map = new TreeMap<>();
        s = s.toLowerCase().replace(".", " ").replace(".", " ").
                replace("!", " ").replace("?", " ");
        String[] words = s.split(" ");
        for (int i = 0; i < words.length; i++) {
            map.putIfAbsent(words[i], 0);
            map.put(words[i], map.get(words[i]) + 1);

        }

        return map.get(f.toLowerCase());
    }
}


