package strategies;

import models.Cab;
import models.Location;
import models.Rider;
import java.util.List;

public class DefaultCabMatchingStrategy implements CabMatchingStrategy {
    @Override
    public Cab findMatchedCab(Rider rider, List<Cab> candidateCabs, Location from, Location to) {
        if (candidateCabs.isEmpty()) {
            return null;
        }

        return candidateCabs.get(0);
    }
}
