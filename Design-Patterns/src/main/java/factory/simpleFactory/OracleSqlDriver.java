package factory.simpleFactory;

public class OracleSqlDriver implements DatabaseDriver {
    @Override
    public void connect() {
        System.out.println("connect OracleDriver");
    }

    @Override
    public void query() {
        System.out.println("query OracleDriver");
    }

    @Override
    public void close() {
        System.out.println("close OracleDriver");
    }
}
