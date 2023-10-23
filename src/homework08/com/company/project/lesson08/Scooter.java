package homework08.com.company.project.lesson08;

public class Scooter extends Bicycle /*implements Changes*/ {
    public boolean isElectric = false;
    public String colour;

    public Scooter(String number, int maxSpeed, boolean isElectric) {
        super(number, maxSpeed);
        this.isElectric = isElectric;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    @Override
    public void repair() {
        if (isElectric) if (levelOfWare >= 2) levelOfWare -= 2;
        else if (levelOfWare >= 3) {
            levelOfWare -= 3;
        }
    }

    //@Override
    public void changeColour(String colour) {
        this.colour = colour;

    }

   // @Override
    public void recoveryColour() {
        if (colour != null)
            changeColour(colour);

    }
}
