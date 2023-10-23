package homework08.com.company.project.lesson08;

public class Car extends Vehicle implements Changes {
    private String colour = "white";
    private int maxSpeed = 240;

    public void setColour(String colour) {
        this.colour = colour;
    }

    public Car(String number) {
        super(number);
    }

    public Car(String number, String colour, int maxSpeed) {
        super(number);
        this.colour = colour;
        this.maxSpeed = maxSpeed;
    }

    @Override
    public void changeColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void recoveryColour() {

    }

    /*@Override
    public void repair() {
        if (levelOfWare > 0) levelOfWare--;
    }*/


}
