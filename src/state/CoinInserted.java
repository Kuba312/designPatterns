package state;


import java.util.Random;

public class CoinInserted implements State {


    @Override
    public void coinInserted(OneArmedBandit oneArmedBandit) {
        System.out.println("Moneta została juz włozona");
    }

    @Override
    public void pullTheLevers(OneArmedBandit oneArmedBandit) {
        System.out.println("Losuje...");
        int result = new Random().nextInt(99);
        if (result < 20) {
            System.out.println("Wygrana!");
            oneArmedBandit.state = new Win();
        } else {
            System.out.println("brak szczęscia ");
            oneArmedBandit.state = new NoCoin();
        }

    }

    @Override
    public void collectTheWinnings(OneArmedBandit oneArmedBandit) {
        System.out.println("Pociągnij dźwignie by sprawdzić swoje szczęście.");
    }


    @Override
    public void win(OneArmedBandit oneArmedBandit) {

        System.out.println("Aktualny stan - WRZUCONO MONETĘ");

    }
}
