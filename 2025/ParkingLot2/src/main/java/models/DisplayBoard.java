package models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class DisplayBoard {
    private int countLargeSpots;
    private int countSmallSpots;
    private int countMediumSpots;
    private int countElectricSpots;

    public DisplayBoard(int countLargeSpots, int countMediumSpots, int countSmallSpots, int countElectricSpots) {
        this.countSmallSpots = countSmallSpots;
        this.countMediumSpots = countMediumSpots;
        this.countLargeSpots = countLargeSpots;
        this.countElectricSpots = countElectricSpots;
    }

    @Override
    public String toString() {
        return "DisplayBoard{" +
                "countLargeSpots=" + countLargeSpots +
                ", countSmallSpots=" + countSmallSpots +
                ", countMediumSpots=" + countMediumSpots +
                ", countElectricSpots=" + countElectricSpots +
                '}';
    }
}
