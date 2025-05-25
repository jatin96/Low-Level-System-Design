package models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
public class Vehicle {
    private String manufacturer;
    private String model;
    private String numberPlate;
    private VehicleType size;

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer=" + manufacturer +
                ", model=" + model +
                ", numberPlate=" + numberPlate +
                ", size=" + size +
                '}';
    }
}
