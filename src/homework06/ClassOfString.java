package homework06;

public class ClassOfString {
    public static void main(String[] args) {
        /*1.
            Дана строка, содержащая только буквы и цифры. Вывести информацию о том, является ли данная трока палиндромом.*/
        String s = "2024! Happy New Year";
        int len = s.length();
        char chStart = s.charAt(0), chEnd = s.charAt(len - 1);
        if (chStart == chEnd)
            System.out.println("Строка является палиндромом");
        else System.out.println("Строка не является палиндромом");

        /*2.
            Даны две строки, строки, содержащие только буквы английского алфавита.
        Вывести информацию о том, являются ли одна строка анаграммой другой строки.*/


    }
}
