package com.company.project.lesson17.task02;

import homework08.com.company.project.lesson08.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Task01 {
    /*Написать метод, принимающий на вход мапу и уровень износа. Ключи мапы - номера транспортных средств,
    значения - любые транспортные средства. Метод возвращает список транспортных средств, уровень износа которых больше переданного в метод.*/


    public List<Vehicle> getVehiclesWithHigherWear(Map<Integer, Vehicle> vehicles, int levelOfWare) {
        List<Vehicle> result = new ArrayList<>();

        for (Map.Entry<Integer, Vehicle> entry : vehicles.entrySet()) {
            Vehicle vehicle = entry.getValue();
            if (vehicle.getLevelOfWare() > levelOfWare) {
                result.add(vehicle);
            }
        }

        return result;
    }
}
