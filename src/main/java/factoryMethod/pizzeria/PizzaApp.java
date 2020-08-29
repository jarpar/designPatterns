package factoryMethod.pizzeria;

public class PizzaApp {
    public static void main(String[] args) {
        Pizzeria pizzeria = new WloskaPizzeria();
        pizzeria.zamowPizze("serowa");

        pizzeria = new AmerykanskaPizzeria();
        pizzeria.zamowPizze("serowa");
    }
}
