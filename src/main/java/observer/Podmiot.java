package observer;

public interface Podmiot {
    public void zarejestrujObserwatora(Obserwator obserwator);

    public void usunObserwatora(Obserwator obserwator);

    public void powiadomObserwatora(Obserwator obserwator);

}
