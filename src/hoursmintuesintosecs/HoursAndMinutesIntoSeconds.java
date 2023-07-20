package hoursmintuesintosecs;

public class HoursAndMinutesIntoSeconds {
    public long convert(int hours, int minutes) {
        long result = 0;
        if (hours < 0 || minutes < 0) {
            result = -1;
        } else if (hours == 0 && minutes == 0) {
            result = 0;
        } else {
            result = hours * 60 * 60 + minutes * 60;
        }
        return result;
    }

}
