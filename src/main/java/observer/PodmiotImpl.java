package observer;

import java.util.ArrayList;
import java.util.List;

public class PodmiotImpl implements Podmiot {

    private List<Obserwator> obserwatorList = new ArrayList<>();

    int counter = 1;

    @Override
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwatorList.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        obserwatorList.remove(obserwator);
    }

    @Override
    public void powiadomObserwatorow() {
        for (Obserwator obserwator: obserwatorList) {
            obserwator.aktualizacja(counter);
        }
    }

    public void increaseCounter() {
        counter++;

        powiadomObserwatorow();
    }
}
