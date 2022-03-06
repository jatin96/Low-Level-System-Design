package models;

public class Rider {
    private String riderName;
    private String riderId;

    public Rider(final String riderId, final String riderName) {
        this.riderId = riderId;
        this.riderName = riderName;
    }

    public String getRiderName() { return this.riderName; }
    public String getRiderId() { return this.riderId; }
}
