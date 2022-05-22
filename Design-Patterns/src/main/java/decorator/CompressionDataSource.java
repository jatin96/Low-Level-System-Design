package decorator;

import javax.xml.crypto.Data;

// Step 1 : implement the common interface
public class CompressionDataSource implements DataSource {

    private DataSource dataSource;
    // Step 2: Accept the current entity in the constructor
    public CompressionDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }
    @Override
    public String read() {
        String value = dataSource.read();
        return decompress(value);
    }

    private String decompress(String value) {
        return "Decompress";
    }

    @Override
    public void write(String data) {
        String compressedValue = compress(data);
        dataSource.write(compressedValue);
    }

    private String compress(String data) {
        return "Compressed";
    }
}
