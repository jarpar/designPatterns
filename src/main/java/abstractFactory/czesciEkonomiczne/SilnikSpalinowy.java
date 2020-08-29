package abstractFactory.czesciEkonomiczne;

import abstractFactory.Silnik;

public class SilnikSpalinowy implements Silnik {
    @Override
    public void utworz() {
        System.out.println("Utworzono silnik spalinowy");
    }
}
