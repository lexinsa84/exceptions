package homework2.task1;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class DateCorrector {
    public String correctDate(String dateStr) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        try {
            LocalDate date = LocalDate.parse(dateStr, formatter);

            LocalDate minDate = LocalDate.of(1, 1, 1);
            LocalDate maxDate = LocalDate.of(9999, 12, 31);

            if (date.isBefore(minDate) || date.isAfter(maxDate)) {
                return "Ошибка: Дата выходит за пределы допустимого диапазона (0001-01-01 до 9999-12-31).";
            }
            int expectedDay = Integer.parseInt(dateStr.substring(8, 10));
            if (date.getDayOfMonth() != expectedDay) {
                return "Ошибка: День месяца не соответствует ожидаемому.";
            }
            int expectedMonth = Integer.parseInt(dateStr.substring(5, 7));
            if (date.getMonthValue() != expectedMonth) {
                return "Ошибка: Месяц не соответствует ожидаемому.";
            }
            boolean isLeapYear = date.isLeapYear();
            String leapYearStatus = isLeapYear ? "год является високосным." : "год не является високосным.";

            return "Корректная дата: " + date + " (" + leapYearStatus + ")";
        } catch (Exception e) {
            return "Ошибка: Неверный формат даты. Ожидаемый формат: YYYY-MM-DD.";
        }
    }
}
