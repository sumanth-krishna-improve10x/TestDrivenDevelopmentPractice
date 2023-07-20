package convertagetodays;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AgeToDaysTest {

    private AgeIntoDays ageIntoDays;

    @BeforeEach
    public void setup() {
        ageIntoDays = new AgeIntoDays();
    }

    @Test
    public void nothing() {

    }

    @Test
    public void givenZero_returnZero() {
        int ageInDays = ageIntoDays.calculateAgeInDays(0);
        assertEquals(0, ageInDays);
    }

    @Test
    public void givenOne_return365() {
        int ageInDays = ageIntoDays.calculateAgeInDays(1);
        assertEquals(365, ageInDays);
    }

    @Test
    public void given23_return8395() {
        int ageInDays = ageIntoDays.calculateAgeInDays(23);
        assertEquals(8395, ageInDays);
    }

    @Test
    public void given2023_return738395() {
        int ageInDays = ageIntoDays.calculateAgeInDays(2023);
        assertEquals(738395, ageInDays);
    }
}
