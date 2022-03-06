package managers;

import exceptions.NoCabsAvailableException;
import exceptions.TripNotFoundException;
import models.Cab;
import models.Location;
import models.Rider;
import models.Trip;
import strategies.CabMatchingStrategy;
import strategies.PricingStrategy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TripsManager {

    public static final Double MAX_DIST = 10.0;
    private CabManager cabManager;
    private CabMatchingStrategy cabMatchingStrategy;
    private PricingStrategy pricingStrategy;
    private Map<String, List<Trip>> trips = new HashMap<>();

    public TripsManager(final CabManager cabManager,
                        final CabMatchingStrategy cabMatchingStrategy,
                        final PricingStrategy pricingStrategy) {
        this.cabManager = cabManager;
        this.cabMatchingStrategy = cabMatchingStrategy;
        this.pricingStrategy = pricingStrategy;
    }

    public Trip bookTrip(final Rider rider, final Location from, final Location to) {
        List<Cab> nearbyCabs = cabManager.getCabsWithinDistance(from, MAX_DIST);
        List<Cab> availableCabs = new ArrayList<>();
        for (Cab nearbyCab : nearbyCabs) {
            if (nearbyCab.getCurrentTrip() == null) {
                availableCabs.add(nearbyCab);
            }
        }

        final Cab selectedCab = cabMatchingStrategy.findMatchedCab(rider, availableCabs, from, to);

        if (selectedCab == null)
            throw new NoCabsAvailableException();

        final Double price = pricingStrategy.findPrice(from, to);
        final Trip newTrip = new Trip(from, to, rider, selectedCab, price);

        if (!trips.containsKey(rider.getRiderId())) {
            trips.put(rider.getRiderId(), new ArrayList<Trip>(List.of(newTrip)));
        } else {
            trips.get(rider.getRiderId()).add(newTrip);
        }

        selectedCab.setCurrentTrip(newTrip);
        return newTrip;
    }

    public List<Trip> getTripHistory(Rider rider) {
        return trips.get(rider.getRiderId());
    }

    public void endTrip(final Cab cab) {
        if (cab.getCurrentTrip() == null) {
            throw new TripNotFoundException();
        }

        cab.getCurrentTrip().endTrip();
        cab.setCurrentTrip(null);

    }
}
