package adapter;

import adapter.external.CashfreeApi;

public class CashfreeProvider implements PaymentProviderInterface {

    CashfreeApi cashfreeApi = new CashfreeApi();
    @Override
    public String generateLink() {
        return cashfreeApi.createUrl();
    }

    @Override
    public void pay() {
        cashfreeApi.doPayment();
    }

    @Override
    public void verify() {
        cashfreeApi.verifyStatus();
    }
}
