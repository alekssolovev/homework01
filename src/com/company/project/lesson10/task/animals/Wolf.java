package com.company.project.lesson10.task.animals;

import java.util.Arrays;

public class Wolf extends WildAnimal {
    private final String[] likeToEat;
    private final String color;

    public Wolf(String[] likeToEat, String color) {
        this.likeToEat = likeToEat;
        this.color = color;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Wolf wolf = (Wolf) o;

        for (int i = 0; i < likeToEat.length; i++) {
            if (!(likeToEat[i].equals(wolf.likeToEat[i])))
                return false;
        }
        return color.equals(wolf.color);
    }


}