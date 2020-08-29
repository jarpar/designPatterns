package factoryMethod;

public class EuropeanCarManufacture extends CarManufacture {
    @Override
    protected Car createCar(String type) {

        if (type.equals("Audi")) {
            return new EuropeanAudi();
        } else {
            throw new IllegalArgumentException("Unknown car " + type);
        }
    }
}
