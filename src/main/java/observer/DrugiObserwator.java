package observer;

public class DrugiObserwator implements Obserwator {
    @Override
    public void aktualizacja(int counter) {
        System.out.println("Jestem drugim obserwatorem i dostałem counter = " + counter);
    }
}
