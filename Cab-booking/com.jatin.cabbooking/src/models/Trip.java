package models;

import static models.TripStatus.FINISHED;
import static models.TripStatus.IN_PROGRESS;

enum TripStatus {
    IN_PROGRESS,
    FINISHED
}

public class Trip {
    private Location from;
    private Location to;
    private Rider rider;
    private Cab cab;
    private double price;
    private TripStatus tripStatus;

    public Trip(final Location from, final Location to, final Rider rider, final Cab cab, final double price) {
        this.rider = rider;
        this.cab = cab;
        this.to = to;
        this.from = from;
        this.price = price;
        this.tripStatus = IN_PROGRESS;
    }

    public Rider getRider() { return rider; }
    public Cab getCab() { return cab; }
    public Location getFrom() { return from; }
    public Location getTo() { return to; }
    public Double getPrice() { return price; }
    public TripStatus getTripStatus() { return tripStatus; }

    public void endTrip() {
        this.tripStatus = FINISHED;
    }
}
