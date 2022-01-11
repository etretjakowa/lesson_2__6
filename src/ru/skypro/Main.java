package ru.skypro;


import java.util.*;

public class Main {


    public static void main(String[] args) {


        List<Integer> nums = new ArrayList<>(List.of(2, 5, 3, 8, 4, 7, 7, 1, 6, 2, 2, 3, 1));

        List<String> words = new ArrayList<>(List.of("Один", "Четыре", "Три", "Семь", "Один",
                "Шесть", "Два", "Три", "Пять", "Восемь", "Восемь", "Девять"));

        // Задача 1

        for (Integer num : nums) {
            if (num % 2 != 0) {
                System.out.print(num + " ");
            }

        }
        System.out.println();

        // Задача 2

        List<Integer> uniqueEvenNumbers = new ArrayList<>(Set.copyOf(nums));
        Collections.sort(uniqueEvenNumbers);
        uniqueEvenNumbers.removeIf(num -> num % 2 != 0);
        for (Integer num : uniqueEvenNumbers) {
            System.out.print(num + " ");
        }

        System.out.println();

        // Задача 3

        Set<String> uniqueWords = new HashSet<>(words);
        System.out.println(uniqueWords);

        // Задача 4

        Set<String> uniqueWord = new HashSet<>(words);
        System.out.println(words.size() - uniqueWord.size());
    }
}
