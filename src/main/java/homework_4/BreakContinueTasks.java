package homework_4;

import java.util.Scanner;

public class BreakContinueTasks {
    public static void main(String[] args) {
        // проверка метода суммы чисел до первого отрицательного
//        sumOfNumbersToFirstNegative();

        // проверка метода пропуска чисел, делящихся на 3
//        skippingNumbersDivisibleBy3();

        // проверка вывода только положительных чисел
//        printPositiveNumbers();

        // проверка метода ввода строк до команды "стоп"
        printLinesBeforeStopCommand();

    }

    public static void sumOfNumbersToFirstNegative() {
        Scanner scanner = new Scanner(System.in);

        int number;
        int sum = 0;

        while (true) {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Число меньше 0, сумма чисел до него: " + sum);
                break;
            }
            sum = sum + number;
            System.out.println(sum);
        }
    }

    public static void skippingNumbersDivisibleBy3() {

        for (int i = 1; i <= 20; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }

    public static void printPositiveNumbers() {
        Scanner scanner = new Scanner(System.in);

        int number;

        while (true) {
            System.out.print("Введите число: ");
            number = scanner.nextInt();
            if (number < 0) {
                continue;
            }
            if (number == 0) {
                System.out.println("Вы ввели 0, программа завершена");
                break;
            }
            System.out.println(number);
        }
    }

    public static void printLinesBeforeStopCommand() {
        Scanner scanner = new Scanner(System.in);

        String command = "";

        while (true) {
            System.out.print("Введите команду: ");
            command = scanner.nextLine();
            if (command.equals("stop")) {
                break;
            }
        }
    }
}
