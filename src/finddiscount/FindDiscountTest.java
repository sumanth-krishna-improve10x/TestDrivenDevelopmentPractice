package finddiscount;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindDiscountTest {
    private Discount discount;

    public void setup() {
        discount = new Discount();
    }

    @Test
    public void nothing() {
    }

    @Test
    public void givenAllZeros_returnZero() {
        float finalPrice = discount.findTheDiscount(0, 0);
        assertEquals(0f, finalPrice);
    }

    @Test
    public void givenMinus10AndMinus_returnMinus1() {
        float finalPrice = discount.findTheDiscount(-10, -1);
        assertEquals(-1, finalPrice);
    }

    @Test

    public void given1500And50_return750() {
        float finalPrice = discount.findTheDiscount(1500, 50);
        assertEquals(750, finalPrice);
    }

    @Test
    public void given89And20_return71Point2() {
        float finalPrice = discount.findTheDiscount(89, 20);
        assertEquals(71.2f, finalPrice);
    }

    @Test
    public void given100And75_return25() {
        float finalPrice = discount.findTheDiscount(100, 75);
        assertEquals(25, finalPrice);
    }

    @Test
    public void given700And10_return630() {
        float finalPrice = discount.findTheDiscount(700, 10);
        assertEquals(630, finalPrice);
    }
}
