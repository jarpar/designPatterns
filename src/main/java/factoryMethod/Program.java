package factoryMethod;

public class Program {

    public static void main(String[] args) {

        CarManufacture carManufacture = new EuropeanCarManufacture();
        carManufacture.manufactureCar("Audi");

        System.out.println();

        carManufacture = new AmericanCarManufacture();
        carManufacture.manufactureCar("Audi");
    }
}
