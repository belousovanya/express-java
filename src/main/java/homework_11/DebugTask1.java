package homework_11;

public class DebugTask1 {
    public static void main(String[] args) {
        int[] numbers = {10, 20, 30, 40, 50};
        for (int i = 0; i < numbers.length; i++) { // делаем больше 5, а не больше либо равно 5
            System.out.println(numbers[i]);
        }
    }
}
