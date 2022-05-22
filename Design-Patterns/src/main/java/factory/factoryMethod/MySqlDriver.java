package factory.factoryMethod;

// Step 2 : create concrete implementation
public class MySqlDriver extends DatabaseDriver {

    @Override
    public DatabaseDriver createDriver() {
        return new MySqlDriver();
    }
}
