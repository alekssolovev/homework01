package homework03;
import java.lang.Math;

public class Operators {
    public static void main(String[] args) {
        /* 1.
            Самостоятельно изучить Math.random()
        для генерации псевдослучайных чисел.
            Написать код, который будет проверять попало
        ли случайно сгенерированное целое число из отрезка [10;500] в интервал (25;200) и
        выводить результат в консоль.
            Примеры работы программы: Число 345 не содержится в интервале (25;200)
          Число 110 содержится в интервале (25;200)
         */
        int min = 10;
        int max = 500;
        int randomNum = min + (int) (Math.random() * ((max - min) + 1));
        if (randomNum > 25 && randomNum < 200)
            System.out.println("Число " + randomNum + " содержится в интервале (25;200)");
        else
            System.out.println("Число " + randomNum + " не содержится в интервале (25;200)");

        /* 2.
          Дана переменная currentScoreValue - количество очков, набранное пользователем.

            Если пользователь набрал 90 и более очков, он занял первое место.
            Если пользователь набрал от 80 до 89, он занял второе место.
            Если пользователь набрал от 70 до 79, он занял третье место.
            Если пользователь набрал меньше 70, он не занял никакого места.
            Вывести в консоль, какое место занял пользователь.
         */
        int currentScoreValue = 69;
        if (currentScoreValue > 90)
            System.out.println("Пользователь занял 1 место");
        else if (currentScoreValue <= 89 && currentScoreValue >= 80)
            System.out.println("Пользователь занял 2 место");
        else if (currentScoreValue <= 79 && currentScoreValue >= 70)
            System.out.println("Пользователь занял 3 место");
        else if (currentScoreValue < 70)
            System.out.println("Пользователь не занял никакого места");


    /* 3.
        Даны переменные x и y - координаты точки на плоскости.

        Необходимо определить четверть координатной плоскости, которой принадлежит данная точка. Результат вывести в консоль.

        Если обе координаты положительны, точка принадлежит первой четверти.
        Если координата x отрицательна, а y положительна, точка принадлежит второй четверти.
        Если обе координаты отрицательны, точка принадлежит третьей четверти.
        Если координата x положительна, а y отрицательна, точка принадлежит четвёртой четверти.
     */
        int x = -1, y = -2;
        if (x > 0 && y > 0)
            System.out.println("Точка принадлежит 1 четверти");
        else if(x < 0 && y > 0)
            System.out.println("Точка принадлежит 2 четверти");
        else if(x < 0 && y < 0)
            System.out.println("Точка принадлежит 3 четверти");
        else
            System.out.println("Точка принадлежит 4 четверти");
        /* 4.
            Дана переменная monthNumber, которая хранит порядковый номера месяца.
        И переменная isLeap, которая хранит информацию о том, является ли год високосным.

            Написать программу, которая в зависимости от значения monthNumberвыводит в консоль количество дней в этом месяце.
        Необходимо рассмотреть два случая: год не является високосным и год является високосным.
         */
        int monthNumber = 2, isLeap = 0; //Если переменная is Leap равна 1,то  год високосный, если 0, то нет.
        switch (monthNumber)
        {
            case 2 -> System.out.println("В этом месяце  "+ (28 + isLeap) + " дней.");
            case 1,3,5,7,8,10,12 -> System.out.println(31);
            case 4,6,9,11 -> System.out.println(30);
        }
        /* 5.
            Даны переменные couponNumber - номер купона и resultSum - сумма покупки.

            Если номер купона - 1111, скидка 10%,
            Если номер купона - 3333, скидка 20%,
            Если номер купона - 5555, скидка 30%.
            В остальных случаях скидка не предусмотрена.
            Необходимо вычислить и сохранить в переменную resultSum сумму с учетом скидки, если она предусмотрена.
             Вывести значение resultSum в консоль.
         */
        int couponNumber = 5555; double resultSum = 5000;
        switch (couponNumber)
        {
            case 1111 -> { resultSum =resultSum*0.9;
                System.out.println("Итоговая сумма "+resultSum);}
            case 3333 ->{ resultSum = 5000*0.8;
                System.out.println("Итоговая сумма "+ resultSum);}
            case 5555 -> {resultSum = 5000*0.7;
                System.out.println("Итоговая сумма "+ resultSum);}
            default -> System.out.println("Итоговая сумма "+ resultSum);
        }

    }

}
