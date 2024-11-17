package homework1.task2;
//Реализуйте метод mergeAndValidateArrays, который принимает два
//        массива целых чисел. Метод должен объединить массивы и вернуть новый
//        массив. Если длины массивов не равны, выбрасывайте исключение
//        IllegalArgumentException. Если хотя бы один элемент объединенного
//        массива отрицательный, выбрасывайте исключение RuntimeException с
//        сообщением "Обнаружен отрицательный элемент".

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static int[] mergeAndValidateArrays(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            throw new IllegalArgumentException("Длинны масивов не равны!!!");
        }
        int[] mergeArray = new int[arr1.length + arr2.length];
        System.arraycopy(arr1, 0, mergeArray, 0, arr1.length);
        System.arraycopy(arr2, 0, mergeArray, arr1.length, arr2.length);
        for (int i : mergeArray) {
            if (i < 0)
                throw new RuntimeException("Обнаружен отрицательный элемент");
        }
        return mergeArray;
    }

    public static void main(String[] args) {
        try {
            int[] arr1 = {1, 2, 3};
            int[] arr2 = {4, 5, 6};
            int[] resArr = mergeAndValidateArrays(arr1, arr2);
            System.out.println(Arrays.toString(resArr));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            int[] arr1 = {1, 2, 3, 7};
            int[] arr2 = {4, 5, 6};
            int[] resArr = mergeAndValidateArrays(arr1, arr2);
            System.out.println(Arrays.toString(resArr));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.out.println(e.getMessage());
        }
        try {
            int[] arr1 = {1, 2, -3};
            int[] arr2 = {4, 5, 6};
            int[] resArr = mergeAndValidateArrays(arr1, arr2);
            System.out.println(Arrays.toString(resArr));

        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (RuntimeException e) {
            System.err.println(e.getMessage());
        }
    }
}
