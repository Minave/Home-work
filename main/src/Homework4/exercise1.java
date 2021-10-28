package Homework4;

import java.util.*;

public class exercise1 {

    public static void main(String[] args) {
        List<String> words = Arrays.asList(
                "Samsung", "Apple", "Samsung", "Huawei", "Xiaomi",
                "BBK", "Oppo", "Vivo", "OnePlus", "OnePlus",
                "Vivo", "Samsung", "Lenovo", "Xiaomi", "Realme",
                "OnePlus", "Oppo", "Apple", "OnePlus", "Samsung"
        );

        Set<String> unique = new HashSet<String>(words);

        System.out.println("Исходный массив");
        System.out.println(words.toString());
        System.out.println("Уникальные слова");
        System.out.println(unique.toString());
        System.out.println("Частота встречи слов");
        for (String key : unique) {
            System.out.println(key + ": " + Collections.frequency(words, key));
        }
    }
}