package homework07.com.company.project.lesson07;

import java.lang.Object;
import java.util.Arrays;

public class Book {
    // модификатор private - свойство, конструктор, метод доступны только в текущем классе
    private String name; // значение по умолчанию null (как и для всех ссылочных типов)
    private boolean isPublished; // // значение по умолчанию false (для типа boolean)
    // хранит ссылки на нескольких авторов
    private Author[] authors;
    private int count = 0;


    // ПКМ -> Generate -> Constructor
    // numberOfAuthors - размер массива authors
    // значение numberOfAuthors должно находиться в диапазоне [1, 5)
    public Book(String name, int numberOfAuthors) {
        if (numberOfAuthors < 0 || numberOfAuthors >= 5)
            throw new IllegalArgumentException("количество авторов должно быть от 1 до 4");
        authors = new Author[numberOfAuthors];
        // Устанавливаем значение по умолчанию

        setName(name); // вызов метода внутри класса

    }


    // ПКМ -> Generate -> Setter
    public void setName(String name) { // Setter
        if (name == null) { // если значение name равно null
            // будет выброшено исключение, программа завершит выполнение с ошибкой
            throw new IllegalArgumentException("name not null");
        }
        this.name = name;
    }

    // ПКМ -> Generate -> Getter
    public String getName() { // Getter
        return name;
    }
    // ПКМ -> Generate -> Setter and Getter


    // метод добавления нового автора в массив authors
    public void addAddAuthor(Author author) {

        if (count > authors.length)
            throw new IllegalArgumentException("more");
        for (var i = 0; i < authors.length; i++) {
            if (authors[i] == null) {
                authors[i] = author;
                return;
            }
        }
        System.out.println(count);
        count++;
        System.out.println(Arrays.toString(authors));
    }

}
// новые авторы не должны перезаписывать уже существующих в массиве


