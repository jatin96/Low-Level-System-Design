package models;

public class Location {
    private double x;
    private double y;
    public Location(final double x, final double y) {
        this.x = x;
        this.y = y;
    }

    public double getX() { return x; }
    public double getY() { return y; }

    public double getDistance(Location location) {
        return Math.sqrt((getX() - location.x) * (getX() - location.x) +
                (getY() - location.y) * (getY() - location.y));
    }
}
