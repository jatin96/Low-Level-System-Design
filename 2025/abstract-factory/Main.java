import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import factories.GuiFactory;
import factories.MacOsFactoryImpl;
import factories.WindowsFactoryImpl;

public class Main {
    public static void main(String[] args) throws IOException {
        System.out.print("hello world");
        Application app;
        GuiFactory factory = null;
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String os = bf.readLine();
        if (os.equals("windows")) {
            factory = new WindowsFactoryImpl();
        } else if (os.equals("macos")) {
            factory = new MacOsFactoryImpl();
        }
        app = new Application(factory);
        app.paint();
    }
}
