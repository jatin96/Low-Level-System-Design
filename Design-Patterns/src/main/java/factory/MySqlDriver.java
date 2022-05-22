package factory;

// Step 2 : create concrete implementation
public class MySqlDriver  implements DatabaseDriver {

    @Override
    public void connect() {
        System.out.println("connect mysql");
    }

    @Override
    public void query() {
        System.out.println("query mysql");
    }

    @Override
    public void close() {
        System.out.println("close mysql");
    }
}
