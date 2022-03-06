package managers;

import exceptions.CabAlreadyExistsException;
import exceptions.CabDoesntExistException;
import models.Cab;
import models.Location;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CabManager {
    Map<String, Cab> cabs = new HashMap<>();

    public void registerCab(final Cab cab) {
        if (cabs.containsKey(cab)) {
            throw new CabAlreadyExistsException();
        }

        cabs.put(cab.getCabId(), cab);
    }

    public Cab getCab(final String cabId) {
        if (!cabs.containsKey(cabId)) {
            throw new CabDoesntExistException();
        }

        return cabs.get(cabId);
    }

    public void updateCabLocation(final String cabId, final Location location) {
        Cab cab = this.getCab(cabId);
        cab.setCurrentLocation(location);
    }

    public void setDriverAvailability(final String cabId, final boolean isAvailable) {
        Cab cab = this.getCab(cabId);
        cab.setIsAvailable(isAvailable);
    }

    public List<Cab> getCabsWithinDistance(final Location from, final Double dist) {
        List<Cab> nearbyCabs = new ArrayList<>();
        for (Map.Entry<String, Cab > entry: cabs.entrySet()) {
            Cab cab = entry.getValue();
            if (cab.getIsAvailable() && cab.getCurrentLocation().getDistance(from) <= dist) {
                nearbyCabs.add(cab);
            }
        }

        return nearbyCabs;
    }
}
