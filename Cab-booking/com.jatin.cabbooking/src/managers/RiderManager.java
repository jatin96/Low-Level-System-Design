package managers;

import exceptions.RiderAlreadyExistsException;
import exceptions.RiderDoesntExistException;
import models.Rider;

import java.util.HashMap;
import java.util.Map;

public class RiderManager {
    Map<String, Rider> riders = new HashMap<>();

    public void registerRider(final Rider rider) {
        if (riders.containsKey(rider.getRiderId())) {
            throw new RiderAlreadyExistsException();
        }

        riders.put(rider.getRiderId(), rider);
    }

    public Rider getRider(final String riderId) {
        if (!riders.containsKey(riderId)) {
            throw new RiderDoesntExistException();
        }

        return riders.get(riderId);
    }
}
