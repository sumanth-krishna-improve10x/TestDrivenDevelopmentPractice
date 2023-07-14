package fibonacci;

public class Fibonacci {
    public int find(int n) {
        if(n < 0) {
            return -1;
        }else if(n == 0){
            return 0;
        } else if (n == 1){
            return 1;
        } else {
           return find(n-1) + find(n-2);
        }
    }
}
