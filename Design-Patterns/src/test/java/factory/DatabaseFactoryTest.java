package factory;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class DatabaseFactoryTest {
    @Test
    public void testMySqlDriver() {
        DatabaseDriver driver = DatabaseDriverFactory.createDriver("mysql");
        assertTrue("If mysql is parameter passed, it should be the instance of mysql driver", driver instanceof MySqlDriver);
    }
}
