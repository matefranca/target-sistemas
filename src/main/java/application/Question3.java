package application;

import java.util.Arrays;
import java.util.List;

public class Question3 {

    public Double minValue(Double[] values) {
        Double min = Double.MAX_VALUE;
        for (Double value : values) {
            if (value == 0) continue;
            if (min > value) {
                min = value;
            }
        }
        return min;
    }

    public Double maxValue(Double[] values) {
        Double max = Double.MIN_VALUE;
        for (Double value : values) {
            if (value == 0) continue;
            if (max < value) {
                max = value;
            }
        }
        return max;
    }

    public Integer daysOverAverage(Double[] values) {
        Integer count = 0;
        List<Double> list = Arrays.stream(values).toList();
        Integer workingDaYS = Math.toIntExact(list.stream().filter(x -> x != 0).count());
        Double avg = list.stream().reduce(0.0, (x, y) -> x + y) / workingDaYS;

        for (Double value : values) {
            if (value == 0) continue;
            if (value > avg) {
                count++;
            }
        }

        return count;
    }
}
