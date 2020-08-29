package observer;

import java.util.ArrayList;
import java.util.List;

public class PodmiotImpl implements Podmiot {

    private List<Obserwator> obserwatorList = new ArrayList<Obserwator>();

    @Override
    public void zarejestrujObserwatora(Obserwator obserwator) {
        obserwatorList.add(obserwator);
    }

    @Override
    public void usunObserwatora(Obserwator obserwator) {
        obserwatorList.remove(obserwator);
    }

    @Override
    public void powiadomObserwatora(Obserwator obserwator) {
        for (Obserwator obserwator1 : obserwatorList) {
            obserwator.aktualizacja();
        }
    }

    public int counter = 0;

    public void counter() {
        counter++;
        powiadomObserwatora(obserwatorList.get(0));
    }
}
