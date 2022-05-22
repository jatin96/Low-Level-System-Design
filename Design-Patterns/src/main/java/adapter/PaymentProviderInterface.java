package adapter;

// Step 1: create common adapter interface
public interface PaymentProviderInterface {
    public String generateLink();
    public void pay();
    public void verify();
}
