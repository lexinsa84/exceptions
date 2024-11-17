package homework2.task3;

import java.util.Arrays;

public class StringArraySorter {
    public static String[] sortArray(String[] array) {
        try {
            if (array == null) {
                System.out.println("Ошибка: входной массив равен null.");
                return new String[0];
            }
            Arrays.sort(array);
            return array;
        }
        catch (Exception e)
        {
            System.out.println("Ошибка сортировки массива!!!!");
            return new String[0];
        }
    }
}
