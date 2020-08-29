package abstractFactory.czesciluksusowe;

import abstractFactory.Swiatla;

public class SwiatlaLed implements Swiatla {
    @Override
    public void utworz() {
        System.out.println("Utworzono światła LED");
    }
}
