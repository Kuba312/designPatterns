package state;

public interface State {

    void coinInserted(OneArmedBandit oneArmedBandit);

    void pullTheLevers(OneArmedBandit oneArmedBandit);

    void collectTheWinnings(OneArmedBandit oneArmedBandit);

    void win(OneArmedBandit oneArmedBandit);
}
