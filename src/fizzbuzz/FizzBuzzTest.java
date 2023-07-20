package fizzbuzz;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;
    @BeforeEach
    public void setup() {
        fizzBuzz = new FizzBuzz();
    }
    @Test
    public void nothing() {

    }

    @Test
    public void givenZero_returnZero() {
        String negative = fizzBuzz.findFizzBuzz(0);
        assertEquals("0", negative);
    }

    @Test
    public void givenThree_returnFizz() {
        String givenThree = fizzBuzz.findFizzBuzz(3);
        assertEquals("Fizz", givenThree);
    }
    @Test
    public void givenFive_returnBuzz() {
        String givenFive = fizzBuzz.findFizzBuzz(5);
        assertEquals("Buzz", givenFive);
    }
    @Test
    public void givenFifteen_returnFizzBuzz() {
        String givenFifteen = fizzBuzz.findFizzBuzz(15);
        assertEquals("FizzBuzz", givenFifteen);
    }

    @Test
    public void givenSixty_returnFizzBuzz() {
        String givenSixty = fizzBuzz.findFizzBuzz(60);
        assertEquals("FizzBuzz", givenSixty);
    }

}
