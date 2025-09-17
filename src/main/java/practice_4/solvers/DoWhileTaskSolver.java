package practice_4.solvers;

import java.util.Random;
import java.util.Scanner;

public class DoWhileTaskSolver {
    public static void main(String[] args) {
        // проверка метода по угадыванию рандомного числа
//        guessNumber(7);

        // проверка метода по поиску минимального веденного числа
//        findMin();

        // проверка метода по введению логина и пароля
        checkCredentials();
    }

    public static void guessNumber(int bound) {
        Scanner scanner = new Scanner(System.in);

        int random = new Random().nextInt(bound);
        int number;

        do {
            System.out.print("Угадайте число: ");
            number = scanner.nextInt();
        } while (number != random);

        System.out.println("Верно!");
    }

    public static void findMin() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int min = 2147483647;

        do {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number < min && number >= 0) min = number;
        } while (number >= 0);

        System.out.println("Минимальное число: " + min);
    }

    public static void checkCredentials() {
        Scanner scanner = new Scanner(System.in);

        String login;
        String password;

        do {
            System.out.println("Введите логин: ");
            login = scanner.nextLine();
            System.out.println("Введите пароль: ");
            password = scanner.nextLine();
        } while (!login.equals("admin") || !password.equals("123"));

        System.out.println("Доступ разрешен.");

    }
}
