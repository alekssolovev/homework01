package homework11;

public enum PlanetOfSolarSys {
    MERCURY("Mercury", 3.3011E23, 2.4397E6),
    VENUS("Venus", 4.8675E24, 6.0518E6),
    EARTH("Earth", 5.97237E24, 6.371E6),
    MARS("Mars", 6.4171E23, 3.3895E6),
    JUPITER("Jupiter", 1.8982E27, 6.9911E7),
    SATURN("Saturn", 5.6834E26, 5.8232E7),
    URANUS("Uranus", 8.6810E25, 2.5362E7),
    NEPTUNE("Neptune", 1.02413E26, 2.4622E7);

    private String name;
    private double mass;
    private double radius;

    PlanetOfSolarSys(String name, double mass, double radius) {
        this.name = name;
        this.mass = mass;
        this.radius = radius;
    }
}
