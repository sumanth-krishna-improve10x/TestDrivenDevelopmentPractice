package templerun;

public class Coin {
    private int value;

    public Coin(int value) {
            if (value < 0 || value > 100) {
                throw new InvalidCoinValueException();
            }
            this.value = value;
        }
    public int getValue() {
        return value;
    }
    public class InvalidCoinValueException extends RuntimeException {
    }
}
