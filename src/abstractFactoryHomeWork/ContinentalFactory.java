package abstractFactoryHomeWork;

import abstractFactoryHomeWork.car.Car;
import abstractFactoryHomeWork.car.Jaguar;
import abstractFactoryHomeWork.car.Side;
import abstractFactoryHomeWork.car.TypeOfCar;

public class ContinentalFactory implements Factory {

    Side side = Side.LEFT;

    @Override
    public Car createJaguar(TypeOfCar typeOfCar) {
        if (typeOfCar == TypeOfCar.JAGUAR) {
            return new Jaguar("4.0", "Petrol", 2019, side);
        }
        throw new UnsupportedOperationException("Nieznany typ");
    }



    @Override
    public Car createLandRover(TypeOfCar typeOfCar) {
        if (typeOfCar == TypeOfCar.LAND_ROVER) {
            return new Jaguar("2.0", "Petrol", 2019, side);
        }
        throw new UnsupportedOperationException("Nieznany typ");
    }
}
