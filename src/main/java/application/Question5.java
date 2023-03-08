package application;

public class Question5 {
    public String reverse(String normal) {

        String reversed = "";
        for (int i = normal.length() - 1; i >= 0 ; i--) {
            reversed += normal.charAt(i);
        }

        return reversed;
    }


}
