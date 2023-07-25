package templerun;

public class FireBall {

    private int speed;
    public FireBall(int speed) {
        if(speed < 0 || speed > 100){
            throw  new InvalidFireBallSpeedException();
        }
        this.speed = speed;
    }

    public void roll() {
        System.out.println("FireBall is rolled with " + speed + " kmh speed!");
    }

    public class InvalidFireBallSpeedException extends RuntimeException {
    }
}
