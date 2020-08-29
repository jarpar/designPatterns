package simpleFactory;

public class CarManufacture {

//    private SimpleCarFactory simpleCarFactory;
//
//    public CarManufacture(SimpleCarFactory simpleCarFactory) {
//        this.simpleCarFactory = simpleCarFactory;
//    }

    public void manufactureCar(String type) {

        Car car = SimpleCarFactory.createCar(type);

        car.start();
        car.accelerate();
        car.stop();
    }
}
