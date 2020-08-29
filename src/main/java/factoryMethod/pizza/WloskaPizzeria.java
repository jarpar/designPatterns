package factoryMethod.pizza;

public class WloskaPizzeria extends Pizzeria {
    @Override
    protected Pizza upieczPizze(String type) {

        if (type.equals("serowa")) {
            return new WloskaPizzaSerowa();
        } else {
            throw new IllegalArgumentException("Unknow pizza: " + type);
        }
    }
}
