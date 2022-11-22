package com.sparta;

public enum Planets {
    MERCURY("Mercury", 58000000L, (double) 3.3022E+23),
    VENUS("Venus",108000000L, (double) 4.8685E+24),
    EARTH("Earth", 149600000L, (double) 5.9736e+24),
    MARS("Mars", 228000000L, (double) 6.4185E+23),
    JUPITER("Jupiter", 778000000L, (double) 1.8986E+27),
    SATURN("Saturn", 1400000000L, (double) 5.6846E+26),
    URANUS("Uranus", 2900000000L, (double) 8.6810E+25),
    NEPTUNE("Neptune", 4500000000L, (double) 10.243E+25);

    private final String name;

    private final double distanceToSun;

    private final double mass;

    private Planets(String name, double distanceToSun, double mass) {
        this.name = name;
        this.distanceToSun = distanceToSun;
        this.mass = mass;
    }

    public String getName() {
        return name;
    }

    public double getDistanceToSun() {
        return distanceToSun;
    }

    public double getMass() {
        return mass;
    }
}
