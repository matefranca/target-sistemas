package application;

public class Program {

    public static void main(String[] args) {
        Question1 q1 = new Question1();
        q1.calculate();

        Question2 q2 = new Question2();
        System.out.println(q2.isOnFibonnaci(33));
        System.out.println(q2.isOnFibonnaci(34));

        Question5 q5 = new Question5();
        System.out.println(q5.reverse("normal"));
    }
}
