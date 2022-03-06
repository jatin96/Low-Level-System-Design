package strategies;

import models.Location;

public interface PricingStrategy {
    double findPrice(Location from, Location to);
}
