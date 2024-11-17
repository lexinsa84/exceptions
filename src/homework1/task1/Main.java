package homework1.task1;

//Реализуйте метод convertAndSum, который принимает массив строк, каждая
//из которых должна быть преобразована в целое число. Метод возвращает
//сумму всех чисел. Если хотя бы одна строка не может быть преобразована в
//число, метод должен выбросить исключение NumberFormatException.
//        Дополнительно, если сумма чисел превышает 100, выбрасывайте
//ArithmeticException с сообщением "Превышен лимит суммы".

public class Main {

   public static int convertAndSum(String[] strings) {
        int sum = 0;
        for (String string : strings) {
           try {
               sum += Integer.parseInt(string);
           }
           catch (NumberFormatException e) {
               throw new NumberFormatException("Ошибка преобразования строки в число");
           }
        }
        if (sum>100){
            throw new ArithmeticException("Сумма больше 100!!!");
        }
        return sum;
    }

    public static void main(String[] args) {
        try {
            String[] strings = {"5","4","1"};
            System.out.println(Main.convertAndSum(strings));

        }
        catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try {
            String[] strings = {"5","4","abc"};
            System.out.println(Main.convertAndSum(strings));
        }
        catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
        try {
            String[] strings = {"50","45","10"};
            System.out.println(Main.convertAndSum(strings));
        }
        catch (NumberFormatException | ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

}
