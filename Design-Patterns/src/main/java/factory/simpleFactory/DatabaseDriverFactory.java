package factory.simpleFactory;

// Create simple factory
public class DatabaseDriverFactory {
    public static DatabaseDriver createDriver(String type) {
        if (type.equals("mysql"))
            return new MySqlDriver();
        else if (type.equals("oracle"))
            return new OracleSqlDriver();
        else
            return null;
    }
}
