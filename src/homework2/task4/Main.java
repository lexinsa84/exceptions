package homework2.task4;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5};
        Average average = new Average();
        System.out.println("Среднее значение: " + average.findAverage(numbers));
    }

}
