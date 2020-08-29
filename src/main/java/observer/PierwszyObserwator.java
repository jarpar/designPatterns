package observer;

public class PierwszyObserwator implements Obserwator {
    @Override
    public void aktualizacja(int counter) {
        System.out.println("Jestem pierwszym obserwatorem i dostałem counter = " + counter);
    }
}
