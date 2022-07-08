package classicBuilder;

public class BigHouseBuilder implements HouseBuilder {

    private House house;

    public BigHouseBuilder() {
        this.house = new House();
    }


    @Override
    public void buildWalls() {
        this.house.setWalls("big Walls");

    }

    @Override
    public void buildFloors() {
        this.house.setFloors("big Floors");
    }

    @Override
    public void buildRooms() {
        this.house.setRooms("big Rooms");

    }

    @Override
    public void buildDoors() {

        this.house.setDoors("big Doors");
    }

    @Override
    public void buildGarage() {

        this.house.setGarage("big Garage");
    }

    @Override
    public void buildWindows() {

        this.house.setWindows("big Windows");
    }

    @Override
    public void buildRoof() {

        this.house.setRoof("big roof");
    }

    @Override
    public House getHouse() {
        return house;
    }
}
