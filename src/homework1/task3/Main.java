package homework1.task3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Реализуйте метод subArraysWithExceptionHandling, который принимает
//        два массива целых чисел. Метод должен возвращать новый массив, где
//        каждый элемент является разностью соответствующих элементов двух входных
//        массивов. Если длины массивов не равны, выбрасывайте
//        IllegalArgumentException с сообщением "Массивы разной длины". Если
//        результат разности оказывается отрицательным, выбрасывайте
//        RuntimeException с сообщением "Отрицательный результат разности".
public class Main {
    public static int[] subArraysWithExceptionHandling(int[] arr1, int[] arr2, List<String> errors) {
       if (arr1.length!=arr2.length)
       {
           errors.add("Длинны массивов не совпадают!!!!");
           return new int[0];
       }
        int[] differencesElementOfArray = new int[arr1.length];
        for (int i = 0; i < differencesElementOfArray.length; i++) {
            differencesElementOfArray[i]=arr1[i]-arr2[i];
            if (differencesElementOfArray[i]<0){
                errors.add("Разность эллементов отриательна!!!!");
        }
        }
        return differencesElementOfArray;
    }

    public static void main(String[] args) {
        List<String> errors = new ArrayList<>();
        int[] a = {10, 20, 30};
        int[] b = {5, 15, 35};
        int[] result = subArraysWithExceptionHandling(a,b,errors);
        System.out.println(Arrays.toString(result));

        int[] c = {10, 20};
        int[] d = {5, 15, 25};
        result = subArraysWithExceptionHandling(c, d, errors);
        System.out.println(Arrays.toString(result));

        if (!errors.isEmpty()) {
            System.out.println("Обнаружены ошибки:");
            for (String error : errors) {
                System.out.println(error);
            }
        } else {
            System.out.println("Ошибок не обнаружено.");
        }

    }
}
