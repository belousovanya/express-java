package homework_4;

import java.util.Scanner;

public class ForTasks {
    public static void main(String[] args) {

        // проверка вывода чисел от 1 до 100, делящихся на 3
//        printNumbersThatAreDivisibleBy3();

        // проверка метода суммы чисел от 1 до n
//        sumOfTheNumbersFrom1toN();

        // проверка таблицы умножения
//        multiplicationTable();

        // проверка на простое число
//        checkPrimeNumber();

        // проверка выаода чисел от 1 до 10
//        printNumbers();
    }

    public static void printNumbersThatAreDivisibleBy3() {
        for (int i = 1; i <= 100; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }
    }

    public static void sumOfTheNumbersFrom1toN() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int n = scanner.nextInt();

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum = sum + i;
        }
        System.out.println(sum);
    }

    public static void multiplicationTable() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            System.out.println(number + " x " + i + " = " + number * i);
        }
    }

    public static void checkPrimeNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i <= number - 1; i++) {
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.println("Число простое");
            } else {
                System.out.println("Число не простое");
            }
        }
    }

    public static void printNumbers() {
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }
    }
}
