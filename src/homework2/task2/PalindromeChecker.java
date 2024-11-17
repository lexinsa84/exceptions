package homework2.task2;

public class PalindromeChecker {
    public static String isPalindrome(String string) {
        try {


            String input = string.replaceAll("[\\W_]", "").toLowerCase();

            // Проверяем, является ли очищенная строка палиндромом
            int length = input.length();
            for (int i = 0; i < length / 2; i++) {
                if (input.charAt(i) != input.charAt(length - i - 1)) {
                    return "Not a palindrome";
                }
            }
            return "Palindrome";
        } catch (Exception e) {
            System.err.println("Ошибка!!!");
            return null;
        }
    }
}
