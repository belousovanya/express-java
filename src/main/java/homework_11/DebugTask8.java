package homework_11;

public class DebugTask8 {
    private static final double EPSILON = 1e-6; // допустимая погрешность при сравнении double

    public static void main(String[] args) {
        double a = 0.1 * 3;
        double b = 0.3;
        if (Math.abs(a - b) < EPSILON) { // если разница между a и b меньше допустимой погрешности, то мы считаем их равными
            System.out.println("Equal");
        } else {
            System.out.println("Not Equal");
        }
    }
}
