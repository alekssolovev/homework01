package com.company.project.lesson27.task2;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

class BackgroundThread implements Runnable {
    private final Map<String, Set<Product>> productsMap;
    private final String outputFilePath;

    BackgroundThread(Map<String, Set<Product>> productsMap, String outputFilePath) {
        this.productsMap = productsMap;
        this.outputFilePath = outputFilePath;
    }

    @Override
    public void run() {
        try (FileWriter writer = new FileWriter(outputFilePath)) {
            for (Set<Product> products : productsMap.values()) {
                for (Product product : products) {
                    writer.write(product.id + ":" + product.quantity + "\n");//записываем информацию о прочитанных товарах
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}