package factoryMethod.pizza;

public abstract class Pizzeria {

    public void zamowPizze(String type) {

        Pizza pizza = upieczPizze(type);

        pizza.przygotuj();
        pizza.upiecz();
        pizza.spakuj();
    }

    protected abstract Pizza upieczPizze(String type);
}
