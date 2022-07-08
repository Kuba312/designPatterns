package abstractFactoryHomeWork;

import abstractFactoryHomeWork.car.Car;
import abstractFactoryHomeWork.car.TypeOfCar;

public interface Factory {

    Car createJaguar(TypeOfCar typeOfCar);

    Car createLandRover(TypeOfCar typeOfCar);


}
