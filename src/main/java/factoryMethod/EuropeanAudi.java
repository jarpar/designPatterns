package factoryMethod;

public class EuropeanAudi implements Car {
    @Override
    public void start() {
        System.out.println("European Audi start");
    }

    @Override
    public void accelerate() {
        System.out.println("European Audi accelerate");
    }

    @Override
    public void stop() {
        System.out.println("European Audi stop");
    }
}
