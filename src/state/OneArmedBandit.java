package state;

public class OneArmedBandit {

    State state;

    public OneArmedBandit() {
        this.state = new NoCoin();
    }

    public void insertTheCoin() {
        state.coinInserted(this);

    }

    public void pullTheLevers() {
        state.pullTheLevers(this);

    }

    public void collectTheWinnings() {
        state.collectTheWinnings(this);
    }


    public void takeTheMoney() {
        state.win(this);
    }

}
