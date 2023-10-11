package homework05;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
import java.util.Arrays;
import java.util.Scanner;

public class ArraysWork {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

    /* 1.
      Объявить массив целых чисел. Длина массива - 15. Заполнить массив четными числами в диапазоне [10, 100).
     Для заполнения массива использовать цикл.*/
        int[] newArray = new int[15];
        int a = 10;
        for (int c = 0; c < newArray.length; c++) {
            newArray[c] = a;
            a += 6;
        }
        System.out.println(Arrays.toString(newArray));
        /* 2.
        Создать два массива целых чисел на 5 элементов каждый. Массивы необходимо заполнять значениями в цикле.
        Значения вводит пользователь с клавиатуры.
        Если число отрицательное, добавить его в первый массив.
        Если число положительное, добавить его во второй массив.
        Программа завершает работу, когда оба массива заполнены или, если пользователь ввёл 0
         */
        int[] positiveArray = new int[5];
        int[] negativeArray = new int[5];
        int f = 0;
        int b = 0;

        System.out.println("Введите целое число");
        while (f < positiveArray.length || b < negativeArray.length) {
            int userInput = scanner.nextInt();
            if (userInput == 0)
                break;
            if (userInput > 0 && f < positiveArray.length) {
                positiveArray[f] = userInput;
                f += 1;
            } else if (userInput < 0 && b < negativeArray.length) {
                negativeArray[b] = userInput;
                b++;
            }

        }
        System.out.println(Arrays.toString(positiveArray));
        System.out.println(Arrays.toString(negativeArray));
        /* 3.
            Заполните массив на len элементов (размер массива вводит пользователь)
            случайным целыми числами и выведете максимальное, минимальное и среднее арифметическое значение элементов массива.
         */
        System.out.println("Введите размер массива");
        int sizeOfArray = scanner.nextInt();//Пользователь задает размер массива.
        int[] randomNumberArray = new int[sizeOfArray];
        scanner.close();
        int min = -10; //Минимальное значение диапазона для генерации числа.
        int max = 2000;//Максимальное значение диапазона для генерации числа.
        int sum = 0;
        for (var count = 0; count < randomNumberArray.length; count++) {
            int randomNum = min + (int) (Math.random() * ((max - min) + 1));
            randomNumberArray[count] = randomNum;
            sum += randomNum;
        }
        int average = sum / sizeOfArray;
        Arrays.sort(randomNumberArray);
        System.out.println("Наибольший эелемент массива " + randomNumberArray[randomNumberArray.length - 1]);
        System.out.println("Наименьший элемент массива " + randomNumberArray[0]);
        System.out.println("Среднее арифметическое элементов массива " + average);
    }


}
