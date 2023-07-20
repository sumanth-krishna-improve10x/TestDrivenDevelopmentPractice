package convertagetodays;

public class AgeIntoDays {
    public int calculateAgeInDays(int age) {
        int result = 0;
        if (age > 0) {
                result = age * 365;
            }
        return result;
    }
}
