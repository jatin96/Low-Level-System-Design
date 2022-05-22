package factory.factoryMethod;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DatabaseFactoryTest {

    DatabaseDriver databaseDriver = null;

    @Before
    public void Setup() {
        databaseDriver = new MySqlDriver();
    }

    @Test
    public void MySqlDriverTest() {
        assertTrue(databaseDriver instanceof MySqlDriver);
    }
}
