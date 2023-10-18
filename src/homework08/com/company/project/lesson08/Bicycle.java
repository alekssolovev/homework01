package homework08.com.company.project.lesson08;

// класс Bicycle наследуется от класса Vehicle
// класс Bicycle - дочерний класс, подкласс, подтип
// класс Vehicle - родительский класс, суперкласс, супертип
// множественное наследование классов запрещено
public class Bicycle extends Vehicle {
    private int numberOfWheels = 2;
    private String type = "Городской";

    // если в родительском классе нет конструктора без параметров,
    // то во всех конструкторах дочернего класса должен вызываться конструктор родителя с параметрами,
    // какой именно, не имеет значение
    // вызов конструктора родителя всегда идет первым
    public Bicycle(String number, int maxSpeed, int numberOfWheels) {
        super(number, maxSpeed); // вызов конструктора родителя
        this.numberOfWheels = numberOfWheels;
    }

    public Bicycle(String number, int maxSpeed) {
        super(number, maxSpeed); // вызов конструктора родителя
    }

    public Bicycle(int maxSpeed, int numberOfWheels, String type) {
        super("1", maxSpeed); // вызов конструктора родителя
        this.numberOfWheels = numberOfWheels;
        this.type = type;
    }

    public int getNumberOfWheels() {
        return numberOfWheels;
    }

    public String getType() {
        return type;
    }
}

