package abstractFactory.czesciEkonomiczne;

import abstractFactory.Swiatla;

public class SwiatlaHalogenowe implements Swiatla {
    @Override
    public void utworz() {
        System.out.println("Utworzono światła halogenowe");
    }
}
