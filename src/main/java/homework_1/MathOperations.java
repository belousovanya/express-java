package homework_1;

public class MathOperations {
    public static void main(String[] args) {

        int sum = add(1, 1);
        System.out.println("Сумма чисел: " + sum);

        int sub = substract(3, 2);
        System.out.println("Разница чисел: " + sub);

        int mult = multiply(3, 3);
        System.out.println("Произведение чисел " + mult);

        double div = divide(7, 3);
        System.out.println("Результат деления: " + div);

        int max = findMax(7, 6);
        System.out.println("Максимальное значение: " + max);

        int diff = difference(4, 5);
        System.out.println("Модуль разности: " + diff);

        System.out.println("Площадь квадрата: " + squareArea(5));
        System.out.println("Периметр квадрата: " + squarePerimeter(6));
        System.out.println("Минут: " + convertSecondsToMinutes(61));
        System.out.println("Средняя скорость: " + averageSpeed(100, 20));
        System.out.println("Средняя скорость: " + averageSpeed(87, 21));
        System.out.println("Гипотенуза " + findHypotenuse(2, 2));
        System.out.println("Гипотенуза " + findHypotenuse(-8, 7));
        System.out.println("Длина окружности: " + circleCircumference(3));
        System.out.println("Длина окружности: " + circleCircumference(-4));
        System.out.println("Процент от общего: " + calculatePercentage(100, 20) + "%");
        System.out.println("Перевод в Фаренгейты: " + celsiusToFahrenheit(10));
        System.out.println("Перевод в Цельсий: " + fahrenheitToCelsius(11));


    }

    public static int add(int x, int y) {
        return x + y;
    }

    public static int substract(int x, int y) {
        return x - y;
    }

    public static int multiply(int x, int y) {
        return x * y;
    }

    public static double divide(int x, int y) {
        return (double) x / y;
    }

    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    public static int difference(int x, int y) {
        return Math.abs(x - y);
    }

    public static int squareArea(int side) {
        return side * side;
    }

    public static int squarePerimeter(int side) {
        return 4 * side;
    }

    public static double convertSecondsToMinutes(int seconds) {
        return (double) seconds / 60;
    }

    public static double averageSpeed(double distance, double time) {
        return distance / time;
    }

    public static double findHypotenuse(double a, double b) {
        return Math.sqrt(a * a + b * b);
    }

    public static double circleCircumference(double radius) {
        return Math.abs(2 * Math.PI * radius);
    }

    public static double calculatePercentage(double total, double part) {
        return (part / total) * 100;
    }

    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    public static double fahrenheitToCelsius(double f) {
        return (f - 32) * 5 / 9;
    }

}
