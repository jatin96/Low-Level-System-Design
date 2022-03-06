package service;

import managers.CabManager;
import managers.RiderManager;
import managers.TripsManager;
import models.Cab;
import models.Location;
import models.Rider;
import models.Trip;

import java.util.List;

public class CabBookingService {
    RiderManager riderManager;
    CabManager cabManager;
    TripsManager tripsManager;
    public CabBookingService(final RiderManager riderManager,
                             final CabManager cabManager,
                             final TripsManager tripsManager) {
        this.riderManager = riderManager;
        this.cabManager = cabManager;
        this.tripsManager = tripsManager;
    }

    public void registerRider(Rider rider) {
        riderManager.registerRider(rider);
    }

    public void registerCab(Cab cab) {
        cabManager.registerCab(cab);
    }

    public void updateCabLocation(final String cabId, final Location location) {
        cabManager.updateCabLocation(cabId, location);
    }

    public void setDriverAvailability(final String cabId, final boolean isAvailable) {
        cabManager.setDriverAvailability(cabId, isAvailable);
    }

    public Trip bookTrip(final String riderId, final Location from, final Location to) {
        final Rider rider = riderManager.getRider(riderId);
        return tripsManager.bookTrip(rider, from, to);
    }

    public List<Trip> getTripHistory(final String riderId) {
        return tripsManager.getTripHistory(riderManager.getRider(riderId));
    }

    public void endTrip(final String cabId) {
        final Cab cab = cabManager.getCab(cabId);
        tripsManager.endTrip(cab);
    }
}
