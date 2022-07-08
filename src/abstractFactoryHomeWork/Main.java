package abstractFactoryHomeWork;

import abstractFactoryHomeWork.car.Car;
import abstractFactoryHomeWork.car.TypeOfCar;

public class Main {
    public static void main(String[] args) {

        Factory commonwealthFactory = new CommonwealthFactory();
        Factory continentalFactory = new ContinentalFactory();

        Car jaguar = commonwealthFactory.createJaguar(TypeOfCar.JAGUAR);
        System.out.println(jaguar);

        Car land = continentalFactory.createLandRover(TypeOfCar.LAND_ROVER);
        System.out.println(land);
    }

}
