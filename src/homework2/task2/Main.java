package homework2.task2;

public class Main {
    public static void main(String[] args) {
        PalindromeChecker palindromeChecker = new PalindromeChecker();
        System.out.println(palindromeChecker.isPalindrome("A man, a plan, a canal, Panama"));
        System.out.println(palindromeChecker.isPalindrome("Hello, World!"));
        System.out.println(palindromeChecker.isPalindrome("Madam"));
        System.out.println(palindromeChecker.isPalindrome("RaceCar"));
        System.out.println(palindromeChecker.isPalindrome("12321"));
    }
}
