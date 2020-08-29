package factoryMethod.pizza;

public class AmerykanskaPizzeria extends Pizzeria {
    @Override
    protected Pizza upieczPizze(String type) {

        if (type.equals("serowa")) {
            return new AmerykanskaPizzaSerowa();
        } else {
            throw new IllegalArgumentException("Unknow pizza: " + type);
        }
    }
}
