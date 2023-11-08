package com.company.project.lesson1516.fruits;

import java.util.*;

public class FruitsStorage {
    // максимальное количество фруктов
    private int numberOfSlots;

    // коллекция fruits, для хранения экземпляров Fruit

    private ArrayList<Fruit> fruits;

    public FruitsStorage(int numberOfSlots) {
        this.numberOfSlots = numberOfSlots;
        fruits = new ArrayList<>();
    }

    // Реализация методов
    public boolean addToStorage(Fruit fruit) {

        // фрукты добавляются в хранилище по следующим правилам:
        // * fruit не может быть null
        Objects.requireNonNull(fruit, "fruit не может быть null");
        // * fruit не может быть ссылкой на существующий элемент коллекции

        // * если в коллекции fruits уже есть фрукт с типом и ценой, как у fruit,
        //   увеличивать значение свойства count фрукта коллекции на значение свойства count
        //   добавляемого фрукта. В противном случае добавлять fruit в коллекцию fruits.
        //   numberOfSlots уменьшается на значение count добавляемого фрукта.
        // * в хранилище нельзя добавить больше numberOfSlots фруктов
        if (fruits.contains(fruit)) {
            int index = fruits.indexOf(fruit);
            Fruit existingFruit = fruits.get(index);
            existingFruit.setCount(existingFruit.getCount() + fruit.getCount());
        } else {
            fruits.add(fruit);
        }

        numberOfSlots -= fruit.getCount();
        return false;
    }
    //return false;


    // вернуть количество фруктов определённого типа
    public int getNumberOfFruitsByType(Fruit.FruitType fruitType) {

        int count = 0;
        for (Fruit fruit : fruits) {
            if (fruit.getType() == fruitType) {
                count += fruit.getCount();
            }
        }
        return count;
    }

    // вернуть количество свободных мест в хранилище
    public int getNumberOfEmptySlots() {
        return numberOfSlots;
    }

    public void increasePrice(int value) {
        // value может быть в диапазоне [10; 30)
        // увеличить цену всех фруктов на value процентов
        if (value >= 10 && value < 30)
            for (Fruit fruit : fruits) {
                double newPrice = fruit.getPrice() * (1 + (double) value / 100);
                fruit.setPrice(newPrice);
            }

    }

    public List<Fruit> getFruitsByTypeAndPrice(Fruit.FruitType fruitType, int maxPrice) {
        // maxPrice должна быть положительной, fruitType не null
        // возвращает список, в который войдут фрукты из коллекции fruits
        // с типом fruitType и ценой не выше maxPrice
        List<Fruit> result = new ArrayList<>();
        if (maxPrice > 0 && fruitType != null)
            for (Fruit fruit : fruits) {
                if (fruit.getType() == fruitType && fruit.getPrice() <= maxPrice) {
                    result.add(fruit);
                }
            }
        return result;

    }

    public Set<Fruit.FruitType> getFruitTypes() {
        // возвращает ссылку на множество с типами фруктов в хранилище
        Set<Fruit.FruitType> fruitTypes = new HashSet<>();
        for (Fruit fruit : fruits) {
            fruitTypes.add(fruit.getType());
        }
        return fruitTypes;
    }

    public double getMinPriceByType(Fruit.FruitType fruitType) {
        // вернуть минимальную цену фрукта с типом fruitType
        double minPrice = 1000.0;
        for (Fruit fruit : fruits) {
            if (fruit.getType() == fruitType && fruit.getPrice() < minPrice) {
                minPrice = fruit.getPrice();
            }
        }
        return minPrice;
    }

}
