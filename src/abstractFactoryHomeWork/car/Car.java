package abstractFactoryHomeWork.car;

public abstract class Car {

    private final String engineCapacity;
    private final String typeOfFuel;
    private final Integer yearOfProduction;
    private Side side;

    protected Car(String engineCapacity, String typeOfFuel, Integer yearOfProduction, Side side) {
        this.engineCapacity = engineCapacity;
        this.typeOfFuel = typeOfFuel;
        this.yearOfProduction = yearOfProduction;
        this.side = side;
    }

    public String getEngineCapacity() {
        return engineCapacity;
    }

    public String getTypeOfFuel() {
        return typeOfFuel;
    }

    public Integer getYearOfProduction() {
        return yearOfProduction;
    }


    public Side getSide() {
        return side;
    }

    @Override
    public String toString() {
        return "Car{" +
                "engineCapacity='" + engineCapacity + '\'' +
                ", typeOfFuel='" + typeOfFuel + '\'' +
                ", yearOfProduction=" + yearOfProduction +
                ", side=" + side +
                '}';
    }
}
