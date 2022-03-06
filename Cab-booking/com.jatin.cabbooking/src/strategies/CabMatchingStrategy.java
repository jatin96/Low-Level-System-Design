package strategies;

import models.Cab;
import models.Location;
import models.Rider;

import java.util.List;

public interface CabMatchingStrategy {
     Cab findMatchedCab(Rider rider, List<Cab> candidateCabs, Location from, Location to);
}
