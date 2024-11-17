package homework2.task3;

import java.util.Arrays;

import static homework2.task3.StringArraySorter.sortArray;

public class Main {
    public static void main(String[] args) {
        String[] words = {"Banana", "Apple", "Cherry", "Date"};
        String[] sortedWords = sortArray(words);
        System.out.println("Отсортированный массив: " + Arrays.toString(sortedWords));

        String[] nullArray = null;
        String[] result = sortArray(nullArray);
        System.out.println("Результат для null массива: " + Arrays.toString(result));

    }
}
