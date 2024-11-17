package homework1.task4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//Реализуйте метод findAndReplace, который принимает массив строк, строку
//        для поиска и строку для замены. Если искомая строка не найдена, добавьте
//        сообщение об ошибке в список. Верните новый массив строк с выполненной
//        заменой.
public class Main {
    public static String[] findAndReplace(String[] strings, String target, String replacement, List<String> errors) {
        String[] replaceArray = new String[strings.length];
        boolean err =false;
        for (int i = 0; i < strings.length; i++) {
            if (strings[i].equals(target)){
                err=true;
                replaceArray[i]=replacement;
            }
            else replaceArray[i]=strings[i];

        }
        if (!err)
            errors.add("Ошибка!!!!!В массиве нет искомой строки!!!");
        return replaceArray;
    }

    public static void main(String[] args) {
        List<String> errors = new ArrayList<>();
        String[] strings = {"apple", "banana", "cherry",
                "date"};
        System.out.println("Результаты до замены: " +
                Arrays.toString(strings));
        String target = "banana";
        String replacement = "orange";
        String[] result = findAndReplace(strings,
                target, replacement, errors);
        System.out.println("Результаты замены: " +
                Arrays.toString(result));
        if (!errors.isEmpty()) {
            System.out.println("Обнаружены ошибки:");
            for (String error : errors) {
                System.out.println(error);
            }
        }
    }

}

