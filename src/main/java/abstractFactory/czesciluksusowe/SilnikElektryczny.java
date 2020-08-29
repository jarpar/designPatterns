package abstractFactory.czesciluksusowe;

import abstractFactory.Silnik;

public class SilnikElektryczny implements Silnik {
    @Override
    public void utworz() {
        System.out.println("Utworzono silnik elektryczny");
    }
}
