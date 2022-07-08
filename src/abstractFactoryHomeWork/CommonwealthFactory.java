package abstractFactoryHomeWork;

import abstractFactoryHomeWork.car.Car;
import abstractFactoryHomeWork.car.Jaguar;
import abstractFactoryHomeWork.car.Side;
import abstractFactoryHomeWork.car.TypeOfCar;

public class CommonwealthFactory implements Factory {

    Side side = Side.RIGHT;

    @Override
    public Car createJaguar(TypeOfCar typeOfCar) {
        if (typeOfCar == TypeOfCar.JAGUAR) {
            return new Jaguar("3.0", "Diesel", 2020, side);
        }
        throw new UnsupportedOperationException("Nieznany typ");
    }

    @Override
    public Car createLandRover(TypeOfCar typeOfCar) {

        if (typeOfCar == TypeOfCar.LAND_ROVER) {
            return new Jaguar("3.0", "Diesel", 2018, side);
        }
        throw new UnsupportedOperationException("Nieznany typ");
    }
}
