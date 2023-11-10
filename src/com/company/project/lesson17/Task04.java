package com.company.project.lesson17;

import java.util.*;

public class Task04 {


    public static void printTopTenWord(String text) {
        // Создаем HashMap для подсчета количества встречаемости слов
        HashMap<String, Integer> wordCount = new HashMap<>();

        // Создаем список артиклей и предлогов, которые будем исключать
        List<String> notWords = Arrays.asList("a", "an", "the", "in", "on", "to", "by");

        // Разбиваем текст на слова и увеличиваем счетчик для каждого слова
        String[] words = text.toLowerCase().split("\\W+");
        for (String word : words) {
            if (!notWords.contains(word)) {
                wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
            }
        }

        // Создаем список пар (слово, количество) и сортируем его по убыванию количества
        List<Map.Entry<String, Integer>> sortedWords = new ArrayList<>(wordCount.entrySet());
        sortedWords.sort(Map.Entry.comparingByValue(Comparator.reverseOrder()));

        int count = 0;// Выводим топ 10 самых часто встречаемых слов
        for (Map.Entry<String, Integer> entry : sortedWords) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
            count++;
            if (count == 10) {
                break;
            }
        }
    }
}
