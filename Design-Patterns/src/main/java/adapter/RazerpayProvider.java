package adapter;

import adapter.external.RazorpayApi;

public class RazerpayProvider implements PaymentProviderInterface {
    private RazorpayApi razorpayApi = new RazorpayApi();

    @Override
    public String generateLink() {
        return razorpayApi.makeLink();
    }

    @Override
    public void pay() {
        razorpayApi.makePayment();
    }

    @Override
    public void verify() {
        razorpayApi.checkStatus();
    }
}
