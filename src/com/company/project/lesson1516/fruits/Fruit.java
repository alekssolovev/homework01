package com.company.project.lesson1516.fruits;

import java.util.Objects;

public class Fruit {
    private final FruitType type;
    private double price;
    private int count;

    public Fruit(FruitType type, double price, int count) {
        this.type = type;
        this.setPrice(price);
        this.setCount(count);
    }

    public FruitType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        if (price >= 0) {
            this.price = price;
        } else {
            throw new IllegalArgumentException("Price cannot be negative");
        }
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        if (count >= 0) {
            this.count = count;
        } else {
            throw new IllegalArgumentException("Count cannot be negative");
        }
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Fruit fruit = (Fruit) obj;
        return Double.compare(fruit.price, price) == 0 &&
                count == fruit.count &&
                type == fruit.type;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, price, count);
    }

    @Override
    public String toString() {
        return "Fruit{" +
                "type=" + type +
                ", price=" + price +
                ", count=" + count +
                '}';
    }

    public enum FruitType {
        APPLE, PEAR, BANANA, APRICOT
    }
}
