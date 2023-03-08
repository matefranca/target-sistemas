package application;

public class Question2 {

    public Boolean isOnFibonnaci(int num) {
        int n = fibonnaci(0);
        int index = 0;
        while (n < num) {
            index++;
            n = fibonnaci(index);
        }

        return n == num;
    }

    public int fibonnaci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonnaci(n - 1) + fibonnaci(n - 2);
        }
    }


}
