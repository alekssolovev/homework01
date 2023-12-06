package com.company.project.lesson27.task2;

class Product {
    String id;
    String name;
    double price;
    int quantity;


    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public int getQuantity() {
        return quantity;
    }

    Product(String id, String name, double price, int quantity) {
        this.id = id;
        this.price = price;
        this.quantity = quantity;
    }
}
