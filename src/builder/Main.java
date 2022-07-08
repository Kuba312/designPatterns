package builder;

public class Main {
    public static void main(String[] args) {
        House house = new House.HouseBuilder()
                .buildDoors("door")
                .buildFloors("floor")
                .buildGarage("garage")
                .buildWalls("walls")
                .buildWindows("windows")
                .buildRoof("roof")
                .buildRooms("rooms")
                .builder();
    }
}
