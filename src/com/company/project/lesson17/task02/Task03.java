package com.company.project.lesson17.task02;

import homework08.com.company.project.lesson08.Vehicle;

import java.util.*;

/*Написать метод, принимающий на вход список ремонтируемых транспортных средств и возвращающий мапу,
где ключи - номера транспортных средств, а значения - любые транспортные средства.
В методе необходимо вызвать метод repair транспортного средства, после чего добавить транспортное средство в результирующую мапу.*/
public class Task03 {
    public Map<String, Vehicle> repairVehicles(List<Vehicle> vehicles) {
        Map<String, Vehicle> repairedVehicles = new HashMap<>();

        for (Vehicle vehicle : vehicles) {
            vehicle.repair();
            repairedVehicles.put(vehicle.getNumber(), vehicle);
        }

        return repairedVehicles;
    }
}
