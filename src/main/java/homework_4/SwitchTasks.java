package homework_4;

import java.util.Scanner;

public class SwitchTasks {
    public static void main(String[] args) {
        // проверка метода по выводу дня недели
//        dayOfWeek();

        // проверка метода вывода стоимости по дню недели
//        ticketPrice();

        // проверка метода перевода числовых оценок в буквенные
//        convertingNumericGrades();

        // проверка метода обработки текстовых команд
//        processingTextCommands();

        // проверка калькулятора
//        calculator();

    }

    public static void dayOfWeek() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня: ");
        int day = scanner.nextInt();

        switch (day) {
            case 1 -> System.out.println("Понедельник");
            case 2 -> System.out.println("Вторник");
            case 3 -> System.out.println("Среда");
            case 4 -> System.out.println("Четверг");
            case 5 -> System.out.println("Пятница");
            case 6 -> System.out.println("Суббота");
            case 7 -> System.out.println("Воскресенье");
            default -> System.out.println("Некорректный номер дня");
        }
    }

    public static void ticketPrice() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите номер дня недели: ");
        int dayOfWeek = scanner.nextInt();

        switch (dayOfWeek) {
            case 1, 2, 3, 4, 5 -> System.out.println("300");
            case 6, 7 -> System.out.println("450");
            default -> System.out.println("Некорректный номер дня");
        }
    }

    public static void convertingNumericGrades() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите числовую оценку: ");
        int score = scanner.nextInt();
        int key = score / 10;

        switch (key) {
            case 10 -> System.out.println("A");
            case 8 -> System.out.println("B");
            case 7 -> System.out.println("C");
            case 6 -> System.out.println("D");
            default -> System.out.println("F");
        }
    }

    public static void processingTextCommands() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите команду: ");
        String command = scanner.nextLine();

        switch (command) {
            case "start" -> System.out.println("Система запущена");
            case "stop" -> System.out.println("Система приостановлена");
            case "restart" -> System.out.println("Система перезапущена");
            case "status" -> System.out.println("Получен статус");
            default -> System.out.println("Неизвестная команда");
        }
    }

    public static void calculator() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите число: ");
        int a = scanner.nextInt();

        System.out.println("Введите число: ");
        int b = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Введите оператор: ");
        String operator = scanner.nextLine();

        switch (operator) {
            case "+":
                System.out.println(a + b);
                break;
            case "-":
                System.out.println(a - b);
                break;
            case "*":
                System.out.println(a * b);
                break;
            case ":":
                if (b == 0) {
                    System.out.println("на 0 делить нельзя!");
                } else {
                    System.out.println(a / b);
                }
                ;
                break;
            default:
                System.out.println("Нет такого оператора!");
        }
    }
}
