package homework08.com.company.project.lesson08;

public class Scooter extends Bicycle {
    boolean isElectric = false;

    public Scooter(String number, int maxSpeed, boolean isElectric) {
        super(number, maxSpeed);
        this.isElectric = isElectric;
    }

    @Override
    public void repair() {
        if (isElectric = true) if (levelOfWare >= 2) levelOfWare -= 2;
        else if (levelOfWare >= 3) {
            levelOfWare -= 3;
        }
    }
}
