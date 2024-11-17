package homework3;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите данные в формате: Фамилия Имя Отчество дата рождения номер телефона пол:");
        String input = scanner.nextLine();
        scanner.close();

        try {
            List<String> parsedData = parseInput(input);
            validateData(parsedData);
            saveToFile(parsedData);
            System.out.println("Данные успешно обработаны и сохранены.");
        } catch (InputMismatchException e) {
            System.err.println("Ошибка ввода: " + e.getMessage());
        } catch (IOException e) {
            System.err.println("Ошибка работы с файлом:");
            e.printStackTrace();
        }
    }

    private static List<String> parseInput(String input) {
        String[] parts = input.trim().split("\\s+");
        if (parts.length != 6) {
            throw new InputMismatchException("Ожидалось 6 элементов, но получено " + parts.length);
        }
        return Arrays.asList(parts);
    }

    private static void validateData(List<String> data) {
        if (!data.get(3).matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
            throw new InputMismatchException("Неверный формат даты рождения. Ожидается формат dd.mm.yyyy.");
        }
        if (!data.get(4).matches("\\d+")) {
            throw new InputMismatchException("Неверный формат номера телефона. Ожидается целое число.");
        }
        if (!data.get(5).matches("[fm]")) {
            throw new InputMismatchException("Неверный формат пола. Ожидается 'f' или 'm'.");
        }
    }

    private static void saveToFile(List<String> data) throws IOException {
        String lastName = data.get(0);
        String fileName = lastName + ".txt";
        String record = String.join(" ", data);

        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName, true))) {
            writer.write(record);
            writer.newLine();
        }
    }
}

