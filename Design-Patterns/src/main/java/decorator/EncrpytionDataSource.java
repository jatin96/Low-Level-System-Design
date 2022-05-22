package decorator;

// Step 1 : Implement the common interface
public class EncrpytionDataSource implements DataSource {

    // Take the base entity in the constructor
    private DataSource dataSource;
    public EncrpytionDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String read() {
        String read = dataSource.read();
        return decrypt(read);
    }

    private String decrypt(String read) {
        return "Decrypted";
    }

    @Override
    public void write(String data) {
        String encryptedValue = encrypt(data);
        dataSource.write(encryptedValue);
    }

    private String encrypt(String value) {
        return "Encrypt";
    }
}
