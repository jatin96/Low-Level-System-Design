package adapter.external;

public class CashfreeApi {
    public String createUrl() {
        return "Cashfree";
    }

    public void doPayment() {
        System.out.println("Cashfree Payment");
    }

    public void verifyStatus() {
        System.out.println("Cashfree status");
    }
}
