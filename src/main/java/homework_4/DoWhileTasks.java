package homework_4;

import java.util.Scanner;

public class DoWhileTasks {
    public static void main(String[] args) {
        // проверка метода запроса положительного числа
//        positiveNumber();

        // проверка метода ввода пароля
//        checkPassword();

        // проверка вывода чисел от 1 до 10 с использованием do-while
//        printNumbers();

        // проверка метода завершения программы
//        exit();

        // проверка подсчета цифр в числе
//        countNumbers();

    }

    public static void positiveNumber() {
        Scanner scanner = new Scanner(System.in);

        int number;

        do {
            System.out.println("Введите число: ");
            number = scanner.nextInt();
        } while (number <= 0);
        System.out.println("Число положительное!");
    }

    public static void checkPassword() {
        Scanner scanner = new Scanner(System.in);

        String password = "";

        do {
            System.out.println("Введите пароль: ");
            password = scanner.nextLine();
        } while (!password.equals("123"));
        System.out.println("Верный пароль");
    }

    public static void printNumbers() {

        int i = 0;
        do {
            i++;
            System.out.println(i);
        } while (i < 10);
    }

    public static void exit() {
        Scanner scanner = new Scanner(System.in);

        String command = "";

        do {
            System.out.println("Введите команду: ");
            command = scanner.nextLine();
        } while (!command.equals("exit"));
        System.out.println("Программа завершена");
    }

    public static void countNumbers() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int number = scanner.nextInt();

        if (number == 0) {
            System.out.println("Число равно нулю");
            return;
        }

        int count = 0;

        do {
            number = number / 10;
            count++;
        } while (number != 0);
        System.out.println("Количество цифр в числе: " + count);
    }
}
