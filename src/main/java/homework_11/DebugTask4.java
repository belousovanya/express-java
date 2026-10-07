package homework_11;

public class DebugTask4 {
    public static void main(String[] args) {
        System.out.println(isPalindrome(null));
    }
    public static boolean isPalindrome(String str) {
        if (str == null) {
            return false;
        } // добавляем условие проверки на null
         String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }
}
