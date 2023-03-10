package application;

import java.util.HashMap;
import java.util.Map;

public class Program {

    public static void main(String[] args) {
        System.out.println("--- Question1 ---");
        Question1 q1 = new Question1();
        q1.calculate();

        System.out.println("\n--- Question2 ---");

        Question2 q2 = new Question2();
        System.out.println(q2.isOnFibonnaci(33));
        System.out.println(q2.isOnFibonnaci(34));

        System.out.println("\n--- Question3 ---");

        Question3 q3 = new Question3();
        Double[] test = {0.0, 1.0, 2.0, 3.0, 4.0, 5.0};
        System.out.println(q3.minValue(test));
        System.out.println(q3.maxValue(test));
        System.out.println(q3.daysOverAverage(test));

        System.out.println("\n--- Question4 ---");

        Map<String, Double> map = new HashMap<>();
        map.put("SP", 67836.43);
        map.put("RJ", 36678.66);
        map.put("MG", 29229.88);
        map.put("ES", 27165.48);
        map.put("Outros", 19849.53);

        Question4 question4 = new Question4();

        Double total = map.values().stream().reduce(0.0, (x, y) -> x + y);

        for (String state : map.keySet()) {
            Double percentage = question4.getPercentage(map.get(state), total);
            System.out.println("The average of " + state + " is " + String.format("%.2f",percentage) + "%");
        }

        System.out.println("\n--- Question5 ---");

        Question5 q5 = new Question5();
        System.out.println(q5.reverse("normal"));
    }
}
