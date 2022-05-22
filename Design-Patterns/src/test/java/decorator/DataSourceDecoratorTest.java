package decorator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DataSourceDecoratorTest {
    DataSource dataSource = null;

    @Before
    public void setUp() {
        dataSource = new FileDataSource();
    }

    @Test
    public void baseDataSourceTest() {
        String value = dataSource.read();
        assertEquals("If base data source is used, it should return base" , "Base" , value);
    }

    @Test
    public void CompressionDataSourceTest() {
        DataSource compressedDataSource = new CompressionDataSource(dataSource);
        DataSource encryptionDataSource = new EncrpytionDataSource(compressedDataSource);
        assertEquals("If compressed data is used, it should return decompressed" , "Decrypted" , encryptionDataSource.read());
    }
}
