package adapter;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PaymentProviderTest {
    PaymentProviderInterface paymentProvider = null;
    @Before
    public void setUp() {
        paymentProvider = new RazerpayProvider();
    }

    @Test
    public void testRazorPay() {
        paymentProvider.verify();
        paymentProvider.generateLink();
        paymentProvider.pay();
        assertTrue("If razorpay is used, then instance should be of razorpay", paymentProvider instanceof RazerpayProvider);
        String link = paymentProvider.generateLink();
        assertEquals("RazorPay" , link);
    }
}
