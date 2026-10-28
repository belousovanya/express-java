package drills.basics;

public class MathTasks {
    public static void main(String[] args) {
        System.out.println("1. Сложение: " + add(1, 2));
        System.out.println("2. Вычитание: " + subtract(2, 1));
        System.out.println("3. Произведение: " + multiple(2, 1));
        System.out.println("4. Деление с остатком: " + divide(9, 4));
        System.out.println("5. Проверка деления на ноль: " + divisionByZero(9, 0));
        System.out.println("6. Определение максимума: " + findMax(5, 6));
        System.out.println("7. Определение минимума: " + findMin(5, 6));
        System.out.println("8. Остаток от деления: " + modulus(6, 4));
        System.out.println("9. Среднее значение: " + average(6, 4));
        System.out.println("10. Проверка чётности: " + isEven(6));
        System.out.println("11. Проверка нечётности: " + isOdd(3));
        System.out.println("12. Квадрат числа 3: " + square(3));
        System.out.println("13. Куб числа 3: " + cube(3));
        System.out.println("14. Корень числа 625: " + squareRoot(625.0));
        System.out.println("15. 5 во 2 степени: " + power(5, 2));
        System.out.println("16. Округление 15.6 вверх: " + roundUp(15.6));
        System.out.println("17. Округление 15.6 вниз: " + roundDown(15.6));
        System.out.println("18. Округление 15.6 до ближайшего целого: " + roundNearest(15.6));
        System.out.println("19. Абсолютное значение -5: " + absolute(-5));
        System.out.println("20. Обмен двух чисел:");
        swap(3, 7);
        System.out.println("21. 120 минут в часах : " + minutesToHours(120));
        System.out.println("22. 120 секунд в минутах : " + secondsToMinutes(120));
        System.out.println("23. 30 по Цельсию в Фаренгейтах : " + celsiusToFahrenheit(30));
        System.out.println("24. 1000 км в милях : " + kmToMiles(1000));
        System.out.println("25. Проверка, делится ли число на 0 : " + isDivisible(9, 3));
    }

    // Задача 1. Сложение двух чисел
    public static int add(int a, int b) {
        return a + b;
    }

    // Задача 2. Разность двух чисел
    public static int subtract(int a, int b) {
        return a - b;
    }

    // Задача 3. Произведение
    public static int multiple(int a, int b) {
        return a * b;
    }

    // Задача 4. Деление с остатком
    public static double divide(int a, int b) {
        return (double) a / b;
    }

    // Задача 5. Проверка деления на ноль
    public static String divisionByZero(int a, int b) {
        if (b == 0) {
            System.out.println();
            return "Ошибка: деление на ноль";
        }
        return Double.toString((double) a / b);
    }

    // Задача 6. Определение максимума
    public static int findMax(int a, int b) {
        return Math.max(a, b);
    }

    // Задача 7. Определение минимума
    public static int findMin(int a, int b) {
        return Math.min(a, b);
    }

    // Задача 8. Определение остатка от деления
    public static int modulus(int a, int b) {
        return a % b;
    }

    // Задача 9. Среднее значение двух чисел
    public static double average(int a, int b) {
        return (a + b) / 2.0;
    }

    // Задача 10. Проверка чётности
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }

    // Задача 11. Проверка нечётности
    public static boolean isOdd(int n) {
        return n % 2 != 0;
    }

    // Задача 12. Возведение в квадрат
    public static int square(int x) {
        return x * x;
    }

    // Задача 13. Возведение в куб
    public static int cube(int x) {
        return x * x * x;
    }

    // Задача 14. Корень из числа
    public static double squareRoot(double x) {
        return Math.sqrt(x);
    }

    // Задача 15. Степень
    public static double power(double base, double exponent) {
        return Math.pow(base, exponent);
    }

    // Задача 16. Округление вверх
    public static double roundUp(double x) {
        return Math.ceil(x);
    }

    // Задача 17. Округлеие вниз
    public static double roundDown(double x) {
        return Math.floor(x);
    }

    // Задача 18. Округление до ближайшего целого
    public static double roundNearest(double x) {
        return Math.round(x);
    }

    // Задача 19. Абсолютное значение
    public static int absolute(int x) {
        return Math.abs(x);
    }

    // Задача 20. Обмен двух чисел
    public static void swap(int a, int b) {
        System.out.println("До обмена: a = " + a + ", b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("После обмена: a = " + a + ", b = " + b);
    }

    // Задача 21. Конвертация минут в часы
    public static double minutesToHours(int minutes) {
        return minutes / 60.0;
    }

    // Задача 22. Конвертация секунд в минуты
    public static double secondsToMinutes(int seconds) {
        return seconds / 60.0;
    }

    // Задача 23. Перевод температуры из Цельсия в Фаренгейты
    public static double celsiusToFahrenheit(double c) {
        return c * 9 / 5 + 32;
    }

    // Задача 24. Перевод расстояния из километров в мили
    public static double kmToMiles(double km) {
        return km * 0.621371;
    }

    // Задача 25. Проверка, делится ли одно число на другое
    public static boolean isDivisible(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("На ноль делить нельзя!");
        }
        return a % b == 0;
    }
}