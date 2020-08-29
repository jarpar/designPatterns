package factoryMethod.pizzeria;

public class WloskaPizzeria implements Pizzeria {
    @Override
    public void zamowPizze(String name) {
        System.out.println("Włoska " + name);

    }
}
