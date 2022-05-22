package decorator;

public class FileDataSource implements DataSource {
    @Override
    public String read() {
        return "Base";
    }

    @Override
    public void write(String data) {
        System.out.println(data);
    }
}
