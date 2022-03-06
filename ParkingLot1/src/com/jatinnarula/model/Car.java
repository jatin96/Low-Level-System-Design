package com.jatinnarula.model;

public class Car {
    private String color;
    private String registrationNumber;

    public String getColor() { return color; }
    public String getRegistrationNumber() { return registrationNumber; }

    public Car(final String registrationNumber, final String color) {
        this.registrationNumber = registrationNumber;
        this.color = color;
    }
}
