package practice_7.exceptions.unchecked;

public class NullPointerExceptionExample {
    public static void main(String[] args) {
        try {
            String text = null;
            int length = text.length(); // Это вызывает NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Попытка вызова метода у null объекта");
        }
    }
}
