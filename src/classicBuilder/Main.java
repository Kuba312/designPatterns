package classicBuilder;

public class Main {
    public static void main(String[] args) {

        SmallHouseBuilder smallHouseBuilder = new SmallHouseBuilder();
        BigHouseBuilder bigHouseBuilder = new BigHouseBuilder();

        HouseDirector smallHouseDirector = new HouseDirector(smallHouseBuilder);
        smallHouseDirector.buildHouse();
        HouseDirector bigHouseDirector = new HouseDirector(bigHouseBuilder);
        bigHouseDirector.buildHouse();

        House house1 = smallHouseDirector.getHouse();
        House house2 = bigHouseDirector.getHouse();
        System.out.println(house1);
        System.out.println(house2);
    }
}
