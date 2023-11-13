package com.company.project.lesson17.task02;

import homework08.com.company.project.lesson08.Car;

import java.util.*;

public class Task02 {
    /*Написать метод, принимающий на вход список перекрашиваемых объектов и мапу,
    где ключи - цвета, а значения - списки покрашенных в данный цвет объектов.
    В методе необходимо наполнить мапу элементами списка.*/
    public static void fillColorMap(List<Car> cars, Map<String, List<Car>> colorMap) {
        for (Car car : cars) {
            String color = car.getColor();

            if (colorMap.containsKey(color)) {
                List<Car> colorList = colorMap.get(color);
                colorList.add(car);
            } else {
                List<Car> colorList = new ArrayList<>();
                colorList.add(car);
                colorMap.put(color, colorList);
            }
        }
    }
}

