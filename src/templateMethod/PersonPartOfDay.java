package templateMethod;

public abstract class PersonPartOfDay {


    public final void partOfMyDay(TypeOfTransport typeOfTransport) {
        wakeUp();
        washBody();
        goToWork();
        int i = comeBackToHome(typeOfTransport);
    }

    public void wakeUp() {
        System.out.println("Budzimy się");
    }

    public void washBody() {
        System.out.println("Myjemy sie!");
    }

    public abstract void goToWork();

    public abstract int comeBackToHome(TypeOfTransport typeOfTransport);

}
