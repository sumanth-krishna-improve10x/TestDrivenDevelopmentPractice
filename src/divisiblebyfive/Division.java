package divisiblebyfive;

public class Division {
    public boolean checkDivisibleByFive(int n) {
        boolean result = false;
        if (n % 5 == 0) {
            result = true;
        }
        return result;
    }
}

