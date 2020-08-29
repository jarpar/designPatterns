package abstractFactory.czesciEkonomiczne;

import abstractFactory.Opony;

public class OponyEkomiczne implements Opony {
    @Override
    public void utworz() {
        System.out.println("Utworzono opony ekonomiczne");
    }
}
