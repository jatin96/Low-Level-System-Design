package decorator;

import javax.xml.crypto.Data;

// Step 1 : implement the interface
public class BaseDataSource implements DataSource {

    //step 2 : accept the entity in the constructor
    private DataSource dataSource;
    public BaseDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
    }

    @Override
    public String read() {
       return dataSource.read();
    }

    @Override
    public void write(String data) {
        dataSource.write(data);
    }
}
