package factory.simpleFactory;

// Step 1 : create an interface
public interface DatabaseDriver {
    public void connect();
    public void query();
    public void close();
}
