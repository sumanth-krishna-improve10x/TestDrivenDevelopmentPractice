package divisiblebyfive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DivisibleByFive {

    @Test
    public void nothing() {
    }

    @Test
    public void givenZero_returnTrue() {
        Division division = new Division();
        boolean result = division.checkDivisibleByFive(0);
        assertEquals(true, result);
    }

    @Test
    public void givenFive_returnTrue() {
        Division division = new Division();
        boolean result = division.checkDivisibleByFive(5);
        assertEquals(true, result);
    }

    @Test
    public void givenMinusFiftyFive_returnTrue() {
        Division division = new Division();
        boolean result = division.checkDivisibleByFive(-55);
        assertEquals(true, result);
    }

    @Test
    public void givenThirtyEight_returnFalse() {
        Division division = new Division();
        boolean result = division.checkDivisibleByFive(38);
        assertEquals(false, result);
    }
}
