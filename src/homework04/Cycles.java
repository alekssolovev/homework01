package homework04;

import java.util.Scanner;
public class Cycles
{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        /*
          Задача на FOR
        Вывести на экран первые 10 элементов последовательности 2 4 6 8 10
         */
        int sub = 2;//Инициализируем 1-й элемент последовательности.
        for(int count = 0;count<=9;count+=1)
        {
            System.out.println(sub);
            sub+=2;
        }


        /*
            Задача на WHILE
            Для введённого пользователем с клавиатуры целого положительного числа посчитайте сумму всех его цифр.
         */

        System.out.print("Введите целое положительное число: ");
        int userInput = scanner.nextInt();
        int sum = 0; //переменная для отображения суммы цифр числа
        int r= 1;//переменная для хранения остатка от деления
        if (userInput > 0) {
            //System.out.println("Вы ввели число: " + userInput);
            for (;r>=1;)
            {
                r=userInput %10;
                sum = sum + r;
                userInput = userInput/10;
            }
            System.out.println("Сумма цифр введенного числа " + sum);
        } else {
            System.out.println("Некорректный ввод. Введите целое положительное число.");
        }




        /* Программа загадывает число в диапазоне [1;9]
        Пользователь вводит число с клавиатуры
        Программа в зависимости от введенного числа выводит в консоль следующее:
        "загаданное число больше"
        "загаданное число меньше"
        "Вы угадали" (программа завершает работу)
         Если введен 0, вывести "выход из программы" (программа завершает работу).*/

        int min = 1;
        int max = 9;
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        int answer = 0;


        do {System.out.println("Введите число от 1 до 9");
             answer = scanner.nextInt();
            if (answer==0){
                System.out.println("Выход из программы");
                break;
            }
            if (answer>randomNum)
                System.out.println("Загаданное число меньше");
            else if(answer<randomNum)
                System.out.println("Загаданное число больше");
             else if(answer==randomNum)
                System.out.println("Вы угадали");
             else  scanner.next();

        } while (answer!=randomNum );
        /*
        Пользователь загадывает число в диапазоне от [1 до 100].
        Пользователь загадывает в уме, программа не хранит это число, а пытается его угадать.
         Программа пытается его угадать (вместо обычного перебора постарайтесь
        использовать метод бинарного поиска, т.е деление отрезка на 2, пока число не будет найдено).
        Программа может задавать пользователю вопросы: Число равно ...?, Число больше ...? и,
         в зависимости от ответа пользователя, принимать решения.
        Вместо текстовых ответов ДА/НЕТ, используйте числа 0 - НЕТ и 1 - ДА*/

        int left = 1; // Левая граница диапазона
        int right = 100; // Правая граница диапазона

        System.out.println("Загадайте число от 1 до 100.");

        while (left <= right) {
            int mid = (left + right) / 2; // Вычисляем середину диапазона

            System.out.println("Число равно " + mid + "? Введите 1, если да и 0,если нет.");
            int number = scanner.nextInt();

            if (number == 1) {
               System.out.println("Программа угадала число!");
                break;}
            else
                System.out.println("Число больше " + mid + "? Введите 1, если да и 0  если нет.");
            int numberChange = scanner.nextInt();

            if (numberChange == 1)
                left = mid + 1; // Сдвигаем левую границу диапазона
             else
                 right = mid - 1; // Сдвигаем правую границу диапазона

                  }


            }
        }



