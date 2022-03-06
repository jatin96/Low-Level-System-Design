package strategies;

import models.Location;

public class DefaultPricingStrategy implements PricingStrategy {
    public static final Double PER_KM_RATE = 10.0;
    @Override
    public double findPrice(Location from, Location to) {
        return from.getDistance(to) * PER_KM_RATE;
    }
}
