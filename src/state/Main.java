package state;

public class Main {
    public static void main(String[] args) {


        OneArmedBandit oneArmedBandit = new OneArmedBandit();

        oneArmedBandit.insertTheCoin();
        oneArmedBandit.takeTheMoney();
        oneArmedBandit.pullTheLevers();
        oneArmedBandit.takeTheMoney();
        oneArmedBandit.collectTheWinnings();
        oneArmedBandit.takeTheMoney();
    }
}
