package homework02;

public class Data {
    public static void main(String[] args) {
        /*
          Объявите переменные для хранения информации об общем количестве писем
        и о количестве отправленных писем.
        Присвойте значения этим переменным.
        Выведите в консоль, сколько писем осталось отправить.
         */
        int totalOfLetters = 53;
        int lettersSent = 24;
        System.out.println("Осталось отправить " + (totalOfLetters-lettersSent) + " писем" );

        /*
            Объявить и инициализировать переменные для хранения времени (в часах) и
         расстояния (в километрах).
         Найти и вывести в консоль скорость, выраженную в метрах в секунду.
         */
        int timeInHours = 8;
        int distInKilometers = 57;
        double speed = (double) distInKilometers /timeInHours;
        System.out.println("Скорость равна " + speed + " километров в час");
        /*
          Найти сумму цифр целого положительного двузначного числа.
         Результат вывести в консоль.
         */
        int number = 46;
        int firstPartOfNumber = number / 10;
        int secondPartOfNumber = number%10;
        System.out.println("Сумма цифр числа равна " + (firstPartOfNumber+secondPartOfNumber));
        /*
        Поменять значения 2х переменных местами, используя арифметические операторы.
        Результат вывести в консоль.
         */
        int a = 5;
        int b = 12;
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
