package factoryMethod;

public class AmericanCarManufacture extends CarManufacture {
    @Override
    protected Car createCar(String type) {

        if (type.equals("Audi")) {
            return new AmericanAudi();
        } else {
            throw new IllegalArgumentException("Unknown Car " + type);
        }
    }
}
