package templateMethod;

public class Main {
    public static void main(String[] args) {

        PersonPartOfDay personPartOfDay = new MyDay();
        personPartOfDay.partOfMyDay(TypeOfTransport.BIKE);
    }
}
