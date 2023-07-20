package hoursmintuesintosecs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HoursMinutesInToSecsTest {

    private HoursAndMinutesIntoSeconds hoursAndMinutesIntoSeconds;

    @BeforeEach
    public void setup() {
        hoursAndMinutesIntoSeconds = new HoursAndMinutesIntoSeconds();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenZero_returnZero() {
        long returnZero = hoursAndMinutesIntoSeconds.convert(0, 0);
        assertEquals(0, returnZero);
    }

    @Test
    public void givenZeroMinusTen_return() {
        long returnZero = hoursAndMinutesIntoSeconds.convert(0, -1);
        assertEquals(-1, returnZero);
    }

    @Test
    public void givenOneAndZero_return3600() {
        long return3600 = hoursAndMinutesIntoSeconds.convert(1, 0);
        assertEquals(3600, return3600);
    }

    @Test
    public void givenZeroOne_return60() {
        long return3600 = hoursAndMinutesIntoSeconds.convert(0, 1);
        assertEquals(60, return3600);
    }

    @Test
    public void givenTwoAndOne_return7260() {
        long return7260 = hoursAndMinutesIntoSeconds.convert(2, 1);
        assertEquals(7260, return7260);
    }

    @Test
    public void given1000_return3603600() {
        long return3603600 = hoursAndMinutesIntoSeconds.convert(1000, 60);
        assertEquals(3603600, return3603600);
    }

    @Test
    public void givenOneMinusTen_return3000() {
        long return3000 = hoursAndMinutesIntoSeconds.convert(-1, -10);
        assertEquals(-1, return3000);
    }

    @Test
    public void givenMinusOneTen_returnMinus3000() {
        long returnMinus3000 = hoursAndMinutesIntoSeconds.convert(-1, 10);
        assertEquals(-1, returnMinus3000);
    }

}
