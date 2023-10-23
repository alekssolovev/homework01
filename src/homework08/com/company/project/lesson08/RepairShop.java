package homework08.com.company.project.lesson08;

import java.util.Arrays;
import java.util.Random;

public class RepairShop {
    // в массив можно добавить тип Vehicle и все его подтипы
    private String[] colours = {"красный", "желтый", "ораньжевый", "черный"};

    private int amountOfVehicles = 2;

    private Vehicle[] vehicles = new Vehicle[amountOfVehicles];


    Random random = new Random();

    public void addToVehicles(Vehicle vehicle) {
        for (var i = 0; i < vehicles.length; i++) {
            if (vehicles[i] == null) {
                vehicles[i] = vehicle;
                return;
            }


        }
        System.out.println(Arrays.toString(vehicles));
    }


    public void repairAll() {
        for (Vehicle vehicle : vehicles) {
            addToVehicles(vehicle);
            // для вызова доступны только методы супертипа, т.е. Vehicle
            // но будет использована реализация конкретного подтипа
            //vehicle.repair();
            if (vehicle instanceof Train train) {
                train.changeClimateControl();
            }
            if (vehicle instanceof Car car) {
                int randomNumber = random.nextInt(4);
                car.changeColour(colours[randomNumber]);
            }
            vehicle.repair();

        }
        for (var i = 0; i < vehicles.length; i++) {
            if (vehicles[i] != null) vehicles[i] = null;
        }
        //System.out.println(Arrays.toString(vehicles));
    }
}
