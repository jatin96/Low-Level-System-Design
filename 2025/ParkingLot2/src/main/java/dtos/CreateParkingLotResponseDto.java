package dtos;

import lombok.Getter;
import lombok.Setter;
import models.ParkingLot;

import java.util.Optional;

@Getter
@Setter
public class CreateParkingLotResponseDto extends ResponseDto {
    public CreateParkingLotResponseDto(ParkingLot parkingLot, ResponseStatus status, String errorMsg) {
        super(status, errorMsg);

        this.parkingLot = parkingLot;
    }
    private ParkingLot parkingLot;
}
