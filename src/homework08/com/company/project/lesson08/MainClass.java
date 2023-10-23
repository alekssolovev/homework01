package homework08.com.company.project.lesson08;

//import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        Bicycle bicycle01 = new Bicycle("1v", 60);
        bicycle01.incLevelOfWare(3);
        bicycle01.repair();

        Train train01 = new Train("123P", 130, 13, true);
        train01.incLevelOfWare(3);
        train01.repair();

        // доступно объявление переменных через общий тип,
        // тогда доступ к методам и свойствам осуществляется согласно типу (слева)
        Vehicle vehicle = new Bicycle("1vh", 30);
        // возможно приведение типов
        Bicycle bVehicle02 = (Bicycle) vehicle;
        // приведение к неверному типу приведет к ClassCastException
        // Train bVehicle01 = (Train) vehicle; // ClassCastException
        Car car = new Car("1");
        Scooter scooter = new Scooter("2", 100, true);
        RepairShop repairShop = new RepairShop();
        repairShop.addToVehicles(scooter);
        repairShop.addToVehicles(car);
        //repairShop.addToVehicles(car);
        repairShop.repairAll();
       /* scooter.changeColour(scooter.colour);
        scooter.recoveryColour();*/


    }
}
