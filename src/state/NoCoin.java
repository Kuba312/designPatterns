package state;

public class NoCoin implements State {


    @Override
    public void coinInserted(OneArmedBandit oneArmedBandit) {
        System.out.println("Moneta wrzucona");
        oneArmedBandit.state = new CoinInserted();

    }

    @Override
    public void pullTheLevers(OneArmedBandit oneArmedBandit) {
        System.out.println("brak monety");
    }

    @Override
    public void collectTheWinnings(OneArmedBandit oneArmedBandit) {
        System.out.println("Brak monety");
    }


    @Override
    public void win(OneArmedBandit oneArmedBandit) {
        System.out.println("brak monety");
    }
}
