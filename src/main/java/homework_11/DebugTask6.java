package homework_11;

public class DebugTask6 {
    public static void main(String[] args) {
        countdown(5);
    }
    public static void countdown(int n) {
        if (n <= 0) {
            return;
        } // рекурсия не знает, когда остановиться. добавила условие остановки
        System.out.println(n);
        countdown(n - 1);
    }
}
