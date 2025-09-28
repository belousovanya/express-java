package homework_4;

import java.util.Scanner;

public class WhileTasks {
    public static void main(String[] args) {
        // проверка метода вычисления факториала
//        factorial();

        // проверка вывода всех четных чисел до заданного
//        printEvenNumbers();

        // проверка обратного отсчета
//        countdown();

    }

    public static void factorial() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        long number = scanner.nextLong();

        if (number < 0) {
            System.out.println("Отрицательное число");
            return;
        }

        long result = 1;
        long i = 1;

        while (i <= number) {
            result = result * i;
            i++;
        }
        System.out.println(result);
    }

    public static void printEvenNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        int i = 1;

        while (i <= number) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
            i++;
        }
    }
    public static void countdown() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number < 0) {
            System.out.println("Отрицательное число");
            return;
        }

        int i = 0;

        while (number > i) {
            System.out.println(number);
            number--;
        }
    }
}
