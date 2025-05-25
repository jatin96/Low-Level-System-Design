package validators;

public class ParkingLotValidator {
    public static boolean validateFloors(int numberOfFloors) {
        return numberOfFloors > 0 || numberOfFloors <= 5;
    }
}
