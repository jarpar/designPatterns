package observer;

public class TrzeciObserwator implements Obserwator {
    @Override
    public void aktualizacja(int counter) {
        System.out.println("Jestem trzecim obserwatorem i dostałem counter = " + counter);
    }
}
