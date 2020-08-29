package observer;

public class Program {

    public static void main(String[] args) {

        Podmiot podmiot = new PodmiotImpl();

        Obserwator pierwszyObserwator = new PierwszyObserwator();
        Obserwator drugiObserwator = new DrugiObserwator();
        Obserwator trzeciObserwator = new TrzeciObserwator();

        podmiot.zarejestrujObserwatora(pierwszyObserwator);
        podmiot.increaseCounter();

        podmiot.zarejestrujObserwatora(drugiObserwator);
        podmiot.zarejestrujObserwatora(trzeciObserwator);
        podmiot.increaseCounter();

        podmiot.usunObserwatora(drugiObserwator);
        podmiot.increaseCounter();
    }
}
