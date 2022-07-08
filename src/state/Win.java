package state;

public class Win implements State {


    @Override
    public void coinInserted(OneArmedBandit oneArmedBandit) {

        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    @Override
    public void pullTheLevers(OneArmedBandit oneArmedBandit) {

        System.out.println("Przed ponowną grą zabierz swoją nagrodę.");
    }

    @Override
    public void collectTheWinnings(OneArmedBandit oneArmedBandit) {

        System.out.println("Zabrano monety. Zacznij ponownie");
        oneArmedBandit.state = new NoCoin();
    }

    @Override
    public void win(OneArmedBandit oneArmedBandit) {
        System.out.println("Rozpocznij nowa grę, aby spróbować szczęscia!");

    }
}
