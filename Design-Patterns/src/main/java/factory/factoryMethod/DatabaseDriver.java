package factory.factoryMethod;

// Step 1 : create an abstract class
public abstract class DatabaseDriver {

    public void connect() {
        DatabaseDriver databaseDriver = createDriver();
        System.out.println("connect for databaseDriver " + databaseDriver);
    }

    // step 2 : create the factory method
    public abstract DatabaseDriver createDriver();
}
