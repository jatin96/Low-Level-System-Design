package observer;

public class TweetNotifier implements Observer {
    @Override
    public void notifyChange() {
        System.out.println("Tweeting..");
    }
}
