package homework07.com.company.project.lesson07;

import homework01.*;

import java.sql.SQLOutput;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        /*Book book = new Book("Book", 1);
        Author author = new Author(1);
        Author author1 = new Author(2);
        Author author2 = new Author(3);
        book.addAddAuthor(author);
        book.addAddAuthor(author1);*/
        Cat cat = new Cat(1);
        Cat cat1 = new Cat(8);
        Cat cat2 = new Cat("Barsik", 2);
        cat1.attack(cat1, cat);
        System.out.println(cat.getNumbersOfVictory());


    }
}
