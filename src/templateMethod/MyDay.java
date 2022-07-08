package templateMethod;

public class MyDay extends PersonPartOfDay {


    @Override
    public void goToWork() {
        System.out.println("Jedziemy do pracy");
    }

    @Override
    public int comeBackToHome(TypeOfTransport typeOfTransport) {
        switch (typeOfTransport) {
            case CAR:
                return 15;
            case BIKE:
                return 25;
            case TRAM:
                return 20;
            default:
                return 20;
        }
    }
}
