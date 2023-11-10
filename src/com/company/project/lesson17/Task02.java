package com.company.project.lesson17;

import java.util.HashMap;
import java.util.Map;

public class Task02 {
    /*Реализовать статический метод, принимающий на вход String word и String text и возвращающий частоту встречаемости слова word в тексте text
    в виде Map<String, Long>. Где ключ - слово, а значение - частота встречаемости*/
    public static Map<String, Long> getWordFrequency(String word, String text) {
        Map<String, Long> frequencyMap = new HashMap<>();
        String[] words = text.split("\\s+");//Делим текст на слова используя разделитель,создаем массив.

        for (String currentWord : words) {
            if (currentWord.equals(word)) {
                frequencyMap.put(word, frequencyMap.getOrDefault(word, 0L) + 1);
                //System.out.println(word);
            }
        }

        return frequencyMap;
    }
}
