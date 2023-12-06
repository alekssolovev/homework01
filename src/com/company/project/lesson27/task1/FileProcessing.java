package com.company.project.lesson27.task1;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class FileProcessing {
    private static int totalCount = 0;

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(4);//создает объект , который может принимать и выполнять задачи в фиксированном пуле потоков.

        String[] fileNames = {
                "src/com/company/project/lesson27/task1/file1.txt",
                "src/com/company/project/lesson27/task1/file2.txt",
                "src/com/company/project/lesson27/task1/file3.txt",
                "src/com/company/project/lesson27/task1/file4.txt"
        };

        for (int i = 0; i < 4; i++) {
            String fileName = fileNames[i];
            executor.submit(new ProcessFileTask(fileName));//отправка задачи на выполнение в пул потоков
        }

        executor.shutdown();//остановка исполнения всех задач
        while (!executor.isTerminated()) {
            // Ждем, пока все потоки завершат свою работу
        }

        System.out.println("Количество сообщений с приоритетом 7 и выше: " + totalCount);
    }

    static class ProcessFileTask implements Runnable {
        private String fileName;

        public ProcessFileTask(String fileName) {
            this.fileName = fileName;
        }

        @Override
        public void run() {
            try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
                String line;
                int count = 0;

                while ((line = reader.readLine()) != null) {// выполняется до тех пор, пока метод `readLine()` возвращает непустую строку
                    String[] parts = line.split("::");//разделение строки "line" на подстроки, используя разделитель "::"
                    int priority = Integer.parseInt(parts[1]);

                    if (priority >= 7) {
                        System.out.println(parts[2]);
                        count++;
                    }
                }

                System.out.println("Количество сообщений с приоритетом 7 и выше в файле " + fileName + ": " + count);
                totalCount += count;

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
