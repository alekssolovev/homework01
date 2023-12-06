package com.company.project.lesson27.task2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.concurrent.CopyOnWriteArraySet;

class FileProcessor implements Runnable {
    private final String filePath;
    private final Map<String, Set<Product>> productsMap;

    FileProcessor(String filePath, Map<String, Set<Product>> productsMap) {
        this.filePath = filePath;
        this.productsMap = productsMap;
    }

    public Map<String, Set<Product>> getProductsMap() {
        return productsMap;
    }

    @Override
    public void run() {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {// выполняется до тех пор, пока метод `readLine()` возвращает непустую строку
                String[] parts = line.split("::");
                if (parts.length >= 4) {
                    String id = parts[0];
                    String name = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    int quantity = Integer.parseInt(parts[3]);

                    Product product = new Product(id, name, price, quantity);
                    //получаем значение  по ключу name из мапы,если значение уже существует, то оно возвращается,
                    //если  нет, то вычисляется новое значение при помощи функции k -> new CopyOnWriteArraySet<>()
                    productsMap.computeIfAbsent(name, k -> new CopyOnWriteArraySet<>()).add(product);

                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
