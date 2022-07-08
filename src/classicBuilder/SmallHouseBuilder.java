package classicBuilder;

public class SmallHouseBuilder implements HouseBuilder {

    private House house;

    public SmallHouseBuilder() {
        this.house = new House();
    }

    @Override
    public void buildWalls() {
        this.house.setWalls("smallWalls");

    }

    @Override
    public void buildFloors() {
        this.house.setFloors("smallFloors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("small Rooms");

    }

    @Override
    public void buildDoors() {

        this.house.setDoors("small Doors");
    }

    @Override
    public void buildGarage() {

        this.house.setGarage("small Garage");
    }

    @Override
    public void buildWindows() {

        this.house.setWindows("small Windows");
    }

    @Override
    public void buildRoof() {

        this.house.setRoof("small roof");
    }

    @Override
    public House getHouse() {
        return house;
    }


}
