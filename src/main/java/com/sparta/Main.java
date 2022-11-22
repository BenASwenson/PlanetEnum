package com.sparta;

public class Main {
    public static void main(String[] args) {

        Planets planet1 = Planets.EARTH;
        System.out.println("Name: " + planet1.getName());
        System.out.println("Distance from sun: " + planet1.getDistanceToSun() + " km");
        System.out.println("Mass: " + planet1.getMass() + " kg");

        Planets planet2 = Planets.EARTH;
        System.out.println("Name: " + planet2.getName());
        System.out.println("Distance from sun: " + planet2.getDistanceToSun() + " km");
        System.out.println("Mass: " + planet2.getMass() + " kg");

        Planets planet3 = Planets.JUPITER;
        System.out.println("Name: " + planet3.getName());
        System.out.println("Distance from sun: " + planet3.getDistanceToSun() + " km");
        System.out.println("Mass: " + planet3.getMass() + " kg");

        System.out.println(planet1 == planet3);
        System.out.println(planet1.equals(planet3));
    }
}