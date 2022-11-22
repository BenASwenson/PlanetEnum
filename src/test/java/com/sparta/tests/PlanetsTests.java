package com.sparta.tests;

import com.sparta.Planets;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class PlanetsTests {

    @Test
    @DisplayName("Given Planet Earth getDistanceToSun returns 5.9736E+24")
    public void planetEarthGetDistanceToSun_Returns59736E24() {
        double expected = 149600000;
        double actual = Planets.EARTH.getDistanceToSun();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given Planet Earth getMass returns 5.9736E+24")
    public void planetEarthGetMass_Returns59736E24() {
        double expected = 5.9736e+24;
        double actual = Planets.EARTH.getMass();
        assertEquals(expected, actual);
    }

    @Test
    @DisplayName("Given Planet Earth getName returns Earth")
    public void planetEarthGetName_ReturnsEarth() {
        String expected = "Earth";
        String actual = Planets.EARTH.getName();
        assertEquals(expected, actual);
    }
}
