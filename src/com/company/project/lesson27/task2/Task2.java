package com.company.project.lesson27.task2;

import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

public class Task2 {
    public static void main(String[] args) {
        String[] fileNames = {"src/com/company/project/lesson27/task2/file1.txt",
                "src/com/company/project/lesson27/task2/file2.txt",
                "src/com/company/project/lesson27/task2/file3.txt",
                "src/com/company/project/lesson27/task2/file4.txt"};
        Map<String, Set<Product>> productsMap = new ConcurrentHashMap<>();

        List<Thread> threads = new ArrayList<>();
        for (String fileName : fileNames) {
            Thread thread = new Thread(new FileProcessor(fileName, productsMap));// thread будет выполнять код, который находится в методе run объекта FileProcessor
            thread.start();
            threads.add(thread);
        }

        for (Thread thread : threads) {
            try {
                thread.join();//текущий поток должен дождаться завершения выполнения другого
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        Thread backgroundThread = new Thread(new BackgroundThread(productsMap, "output.txt"));
        backgroundThread.start();
        try {
            backgroundThread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        //извлекаем данные из мапы с помощью итератора
        Iterator<Map.Entry<String, Set<Product>>> iterator = productsMap.entrySet().iterator();
        Map<String, Double> products = new HashMap<>();
        while (iterator.hasNext()) {
            Map.Entry<String, Set<Product>> entry = iterator.next();
            String key = entry.getKey();
            Set<Product> value = entry.getValue();
            // Итерация по значениям Set<Product>
            Iterator<Product> setIterator = value.iterator();
            while (setIterator.hasNext()) {
                Product product = setIterator.next();
                products.put(key, product.getPrice());
            }
        }
        List<Map.Entry<String, Double>> list = new ArrayList<>(products.entrySet());
        //сортируем стоимость товара в порядке убывания
        Collections.sort(list, new Comparator<Map.Entry<String, Double>>() {
            public int compare(Map.Entry<String, Double> o1, Map.Entry<String, Double> o2) {
                return o1.getValue().compareTo(o2.getValue());
            }
        });

        Map<String, Double> sortedMap = new LinkedHashMap<>();
        for (Map.Entry<String, Double> entrys : list) {
            sortedMap.put(entrys.getKey(), entrys.getValue());
        }

        System.out.println(sortedMap);

    }
}
