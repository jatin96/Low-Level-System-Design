package models;

public class Cab {
    private String cabId;
    private String driverName;
    private boolean isAvailable;
    private Trip currentTrip;
    private Location currentLocation;

    public Cab(final String cabId,
               final String driverName) {
        this.cabId = cabId;
        this.driverName = driverName;
        this.isAvailable = true;
    }

    public String getCabId() {
        return this.cabId;
    }

    public String getDriverName() {
        return this.driverName;
    }

    public boolean getIsAvailable() {
        return this.isAvailable;
    }

    public void setIsAvailable(boolean val) {
        this.isAvailable = val;
    }

    public Trip getCurrentTrip() {
        return this.currentTrip;
    }

    public void setCurrentTrip(Trip currentTrip) {
        this.currentTrip = currentTrip;
    }

    public Location getCurrentLocation() {
        return this.currentLocation;
    }

    public void setCurrentLocation(Location currentLocation) {
        this.currentLocation = currentLocation;
    }
}
