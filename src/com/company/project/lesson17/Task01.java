package com.company.project.lesson17;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class Task01 {
//    Реализовать статический метод, который принимает Collection<String> strings и
//    возвращает количество одинаковых слов
//    в коллекции strings в виде Map<String, Long>.
//    Где ключи - слова, а значения - количество повторений.

    public static Map<String, Long> amountOfWords(Collection<String> strings) {
        Map<String, Long> wordCountMap = new HashMap<>();

        for (String word : strings) {
            Long count = wordCountMap.getOrDefault(word, 0L);//получаем значение связанное с ключом словом.
            wordCountMap.put(word, count + 1);//перезаписываем нужное значение по ключу word.
        }

        return wordCountMap;
    }
}

