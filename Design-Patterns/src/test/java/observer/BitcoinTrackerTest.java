package observer;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BitcoinTrackerTest {
    private BitcoinTracker tracker;

    @Before
    public void setUp() {
        tracker = new BitcoinTracker();
        EmailNotifier emailNotifier = new EmailNotifier();
        tracker.register(emailNotifier);
        tracker.register(new TweetNotifier());
    }

    @Test
    public void testPrice() {
        tracker.setPrice(100.0);
        Bitcoin bitcoin = tracker.getBitcoin();
        assertEquals(100.0, bitcoin.getPrice(), 0.0);
    }
}
