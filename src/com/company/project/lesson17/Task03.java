package com.company.project.lesson17;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task03 {
    /*Реализовать статический метод, принимающий на вход String text и возвращающий
    Map<Integer, List<String>>где ключи - количество букв в словах, значения - списки соответствующих слов.*/
    public static Map<Integer, List<String>> getWordLengthMap(String text) {
        Map<Integer, List<String>> wordLengthMap = new HashMap<>();

        String[] words = text.split("\\s+");//Делим текст на слова используя разделитель,создаем массив

        for (String word : words) {
            int wordLength = word.length();//Создаем переменную для определения длины слова.

            if (!wordLengthMap.containsKey(wordLength)) {//Проверяем содержится ли текущее значение в мапе
                wordLengthMap.put(wordLength, new ArrayList<>());//если нет добавляем ключ в виде длины и список для
                //хранения слов.
            }

            wordLengthMap.get(wordLength).add(word);//если ключ уже есть добавляем в массив новое слово
        }

        return wordLengthMap;
    }
}
