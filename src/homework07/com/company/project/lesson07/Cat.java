package homework07.com.company.project.lesson07;

public class Cat {

    private String name;
    private int weight;
    private int numbersOfVictory = 0;

    public Cat(String name, int weight) {
        if (name.length() < 3)
            throw new IllegalArgumentException("Слишком короткое имя");
        this.name = name;
        if (weight < 1 || weight > 9)
            throw new IllegalArgumentException("Вес должен быть от 1 до 8");
        this.weight = weight;
    }

    public Cat(int weight) {
        if (weight < 1 || weight > 9)
            throw new IllegalArgumentException("Вес должен быть от 1 до 8");
        this.weight = weight;
    }

    public int getNumbersOfVictory() {
        return numbersOfVictory;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setWeight(int weight) {
        if (weight < 1 || weight > 9)
            throw new IllegalArgumentException("Вес должен быть от 1 до 8");
        this.weight = weight;


    }

    public boolean attack(Cat cat, Cat cat1) {
        if (cat1 == null && cat == null)
            throw new IllegalArgumentException("NULL!");
        boolean ifVictory = false;
        if (cat.weight > cat1.weight) {
            cat1.numbersOfVictory++;
            ifVictory = true;
        } else cat.numbersOfVictory++;
        System.out.println(ifVictory);
        return ifVictory;

    }
}
