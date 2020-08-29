package abstractFactory.czesciluksusowe;

import abstractFactory.Opony;

public class OponyLuksusowe implements Opony {
    @Override
    public void utworz() {
        System.out.println("Utworzono opony luksusowe");
    }
}
