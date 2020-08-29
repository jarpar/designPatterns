package strategia;

public class Program {

    public static void main(String[] args) {

        Kaczka dzikaKaczka = new Kaczka(
                new LatamBoUmiem(),
                new PlywamBoUmiem(),
                new Kwakam()
        );
        // latama
        // plywac
        // kwakac

        dzikaKaczka.lec();
        dzikaKaczka.plyn();
        dzikaKaczka.wydajDzwiek();

        Kaczka gumowaKaczka = new Kaczka(
                new NieLatam(),
                new PlywamBoUmiem(),
                new Piszcz()
        );
        // nie latam
        // plywam
        // piszcze

        gumowaKaczka.lec();
        gumowaKaczka.plyn();
        gumowaKaczka.wydajDzwiek();

        gumowaKaczka.setLatanie(new LatamBoUmiem());

        gumowaKaczka.lec();
    }
}
