package adapter.external;

public class RazorpayApi {
    public String makeLink() {
        return "RazorPay";
    }

    public void makePayment() {
        System.out.println("Razorpay payment");
    }

    public void checkStatus() {
        System.out.println("Razorpay status");
    }
}
