package finddiscount;

public class Discount {

    public static float findTheDiscount(float price, float discount) {
        float finalPrice = 0f;
        if (price < 0 && discount < 0) {
            finalPrice = -1;
        } else {
            float discountAmount = price * discount / 100;
            finalPrice = price - discountAmount;
        }
        return finalPrice;
    }
}
