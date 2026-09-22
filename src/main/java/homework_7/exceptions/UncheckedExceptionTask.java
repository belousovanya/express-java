package homework_7.exceptions;

/*
2. Обработка непроверяемого исключения
Условие задачи: Напишите метод, который принимает на вход два числа и выполняет их деление.
Обработайте ситуацию, когда второе число равно нулю, чтобы избежать исключения при делении.
 */
public class UncheckedExceptionTask {
    public static void main(String[] args) {
        division(4, 0);
        division(4, 1);

    }

    public static void division(int a, int b) {
        try {
            int divResult = a / b;
            System.out.println(divResult);
        } catch (ArithmeticException e) {
            System.err.println("На ноль делить нельзя");
        }
    }
}
