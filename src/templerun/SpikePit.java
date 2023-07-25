package templerun;

public class SpikePit {

    private int width;

    public SpikePit() {

    }
    public SpikePit(int width) throws InvalidWidthException {
        if (width < 0 || width > 100) {
            throw new InvalidWidthException();
        }
        this.width = width;
    }

    public void trap() {
        System.out.println("Trap is found " + width + " kmh speed!");
    }

    public class InvalidWidthException  extends RuntimeException{
    }
}
