package observer;

public class Program {
    public static void main(String[] args) {
        Podmiot podmiot = new PodmiotImpl();
        PierwszyObserwator pierwszyObserwator = new PierwszyObserwator();
        DrugiObserwator drugiObserwator = new DrugiObserwator();
        TrzeciObserwator trzeciObserwator = new TrzeciObserwator();
        podmiot.zarejestrujObserwatora(pierwszyObserwator);

    }
}
