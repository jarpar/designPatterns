package factoryMethod.pizza;

public class AmerykanskaPizzaSerowa extends Pizza {
    @Override
    public void przygotuj() {
        System.out.println("przygotuj AmerykanskaPizzaSerowa");
    }

    @Override
    public void upiecz() {
        System.out.println("upiecz AmerykanskaPizzaSerowa");
    }

    @Override
    public void spakuj() {
        System.out.println("spakuj AmerykanskaPizzaSerowa");
    }
}
