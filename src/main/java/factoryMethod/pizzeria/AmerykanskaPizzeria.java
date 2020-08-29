package factoryMethod.pizzeria;

public class AmerykanskaPizzeria implements Pizzeria {

    @Override
    public void zamowPizze(String name) {
        System.out.println("Amerykańska " + name);
    }
}
