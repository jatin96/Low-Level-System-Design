package dtos;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CreateParkingLotRequestDto {
    private int numberOfFloors;
    private String address;
    private int numberOfEntryGates;
    private int numberOfExitGates;
}
