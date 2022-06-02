package observer;

public class EmailNotifier implements Observer {
    @Override
    public void notifyChange() {
        System.out.println("Sending email");
    }
}
