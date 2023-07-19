package twomakesten;

public class TwoMakesTen {

    public boolean findTwoMakesTen(int a , int b){
        boolean result = false;
        if(a == 10 || b == 10 || (a + b) == 10){
            result = true;
        }
        return result;

    }
}
