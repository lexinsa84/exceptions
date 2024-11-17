package homework2.task4;

import java.util.Arrays;

public class Average {
    public double findAverage(int[]array){
        try {

            if (array == null) {
                System.out.println("Ошибка: входной массив равен null.");
                return Double.NaN;
            }
            int sum=0;
            for (int i : array) {
                sum+=i;
            }
            double average = sum/ array.length;
            return average;
        }
        catch (Exception e)
        {
            System.out.println("Ошибка!!!");
            return Double.NaN;
        }
    }
}
