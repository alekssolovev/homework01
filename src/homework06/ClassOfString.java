package homework06;

import javax.swing.*;
import java.util.Arrays;

public class ClassOfString {
    public static void main(String[] args) {
        /*1.
            Дана строка, содержащая только буквы и цифры. Вывести информацию о том, является ли данная трока палиндромом.*/
        String s = "2024! Happy New Year";
        int len = s.length();
        char chStart = s.charAt(0), chEnd = s.charAt(len - 1);
        if (chStart == chEnd)
            System.out.println("Строка является палиндромом");
        else
            System.out.println("Строка не является палиндромом");

        /*2.
            Даны две строки, строки, содержащие только буквы английского алфавита.
        Вывести информацию о том, являются ли одна строка анаграммой другой строки.*/
        //Исходим из того,что не менее 4-х букв в одном слове должны совпадать с буквами в другом.
        String str1 = "world";
        String str2 = "lord";
        int len1 = str1.length();//Определяем длину строк.
        int len2 = str2.length();
        char[] charArray1 = new char[len1];
        char[] charArray2 = new char[len2];//Создаем массивы для хранения  букв 2-х строк.
        for (int i = 0; i < len1; i++) {
            charArray1[i] = str1.charAt(i);
        }
        for (int j = 0; j < len2; j++) {//Заполняем  массивы.
            charArray2[j] = str2.charAt(j);
        }

        int conc = 0;//переменная-счетчик количества совпадений
        for (int i = 0; i < len1; i++) { //Сравниваем совпадают ли буквы в 1 строке с буквами в другой.
            char char1 = charArray1[i];
            for (int j = 0; j < len2; j++) {
                if (char1 == charArray2[j])
                    conc++;
            }
            if (conc >= 4) {
                System.out.println("Одна строка является анаграммой другой строки");
                break;
            }

        }
        if (conc <= 3)
            System.out.println("Одна строка не является анаграммой другой строки");

    }


}

