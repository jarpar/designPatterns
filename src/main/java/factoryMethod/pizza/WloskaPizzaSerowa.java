package factoryMethod.pizza;

public class WloskaPizzaSerowa extends Pizza {
    @Override
    public void przygotuj() {
        System.out.println("Przygotuj WloskaPizzaSerowa");
    }

    @Override
    public void upiecz() {
        System.out.println("upiecz WloskaPizzaSerowa");
    }

    @Override
    public void spakuj() {
        System.out.println("spakuj WloskaPizzaSerowa");
    }
}
