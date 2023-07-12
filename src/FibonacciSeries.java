import org.testng.annotations.Test;
import org.testng.asserts.Assertion;

import static org.testng.AssertJUnit.assertEquals;
import static org.testng.asserts.Assertion.*;

public class FibonacciSeries {

    @Test
    public void nothing(){
    }
    /*
    0 , 1, 1, 2, 3, 5, 8, 13, 21.....
    input 0 -> output 0;
    input 1 -> output 1;
    input 2 -> output 2;
    Any negative -19 -> -1;
     */
    @Test
    public void givenNegativeNumberReturnsNegativeOne(){
       Fibonacci fibonacci = new Fibonacci();
       int negativeNumber = fibonacci.find(-10);
       assertEquals(-1,negativeNumber);
    }

    @Test
    public void giveZeroReturnZero(){
        Fibonacci fibonacci = new Fibonacci();
        int zeroNumber = fibonacci.find(0);
        assertEquals(0,zeroNumber);
    }

    @Test
    public void givenOneReturnsOne(){
        Fibonacci fibonacci = new Fibonacci();
        int oneNumber = fibonacci.find(1);
        assertEquals(1,oneNumber);
    }
    @Test
    public void givenTwoReturnsTwo(){
        Fibonacci fibonacci = new Fibonacci();
        int secondThNumber = fibonacci.find(2);
        assertEquals(1,secondThNumber);
    }
    @Test
    public void givenFiveReturnsFive(){
        Fibonacci fibonacci = new Fibonacci();
        int fifthNumber = fibonacci.find(5);
        assertEquals(5,fifthNumber);
    }
}
