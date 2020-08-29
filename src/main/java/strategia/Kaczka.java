package strategia;

public class Kaczka {

    private Latanie latanie;
    private Plywanie plywanie;
    private Kwakanie kwakanie;

    public void lec() {
        latanie.lec();
    }

    public void plyn() {
        plywanie.plyn();
    }

    public void wydajDzwiek() {
        kwakanie.kwacz();
    }

    public Kaczka(Latanie latanie, Plywanie plywanie, Kwakanie kwakanie) {
        this.latanie = latanie;
        this.plywanie = plywanie;
        this.kwakanie = kwakanie;
    }

    public void setLatanie(Latanie latanie) {
        this.latanie = latanie;
    }

    public void setPlywanie(Plywanie plywanie) {
        this.plywanie = plywanie;
    }

    public void setKwakanie(Kwakanie kwakanie) {
        this.kwakanie = kwakanie;
    }
}
