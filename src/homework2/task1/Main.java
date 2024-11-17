package homework2.task1;

public class Main {
    public static void main(String[] args) {
        DateCorrector dateCorrector = new DateCorrector();
        System.out.println(dateCorrector.correctDate("2024-02-29"));   // Корректная дата високосный год
        System.out.println(dateCorrector.correctDate("2023-02-29"));   // Неверный день месяца
        System.out.println(dateCorrector.correctDate("2023-13-13"));   // Неверный месяц
        System.out.println(dateCorrector.correctDate("10000-01-01"));  // Дата выходит за пределы диапазона
        System.out.println(dateCorrector.correctDate("abcd-ef-gh"));   // Неверный формат
    }
}
