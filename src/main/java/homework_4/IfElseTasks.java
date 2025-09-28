package homework_4;

import java.util.Scanner;

public class IfElseTasks {
    public static void main(String[] args) {
        // проверка метода определения знака числа
//        determineSign();

        // проверка метода поиска наибольшего из двух чисел
//        findMax();

        // проверка метода вывода оценки по шкале 1-5
//        printMarkFrom1tO5();

        // проверка метода проверки числа на четность
//        checkEvenNumber();

        // проверка метода определения размера скидки
//        sale();

        // проверка метода оценки результата теста по баллам
//        checkTestResult();

    }

    public static void determineSign() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number > 0) {
            System.out.println("Число положительное");
        } else if (number < 0) {
            System.out.println("Число отрицательное");
        } else {
            System.out.println("Число равно нулю");
        }
    }

    public static void findMax() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int a = scanner.nextInt();
        System.out.print("Введите число: ");
        int b = scanner.nextInt();

        // первый способ
//        System.out.println(Math.max(a, b));

        // второй способ
        if (a > b) {
            System.out.println(a);
        } else {
            System.out.println(b);
        }
    }

    public static void printMarkFrom1tO5() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите оценку: ");
        int mark = scanner.nextInt();

        // первый способ
        if (mark == 5) {
            System.out.println("Отлично");
        } else if (mark == 4) {
            System.out.println("Хорошо");
        } else if (mark == 3) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
        // второй способ
//        switch (mark) {
//            case 5:
//                System.out.println("Отлично");
//                break;
//
//            case 4:
//                System.out.println("Хорошо");
//                break;
//
//            case 3:
//                System.out.println("Удовлетворительно");
//                break;
//            case 2:
//                System.out.println("Неудовлетворительно");
//                break;
//            case 1:
//                System.out.println("Неудовлетворительно");
//                break;
    }

    public static void checkEvenNumber() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите число: ");
        int number = scanner.nextInt();

        if (number % 2 == 0) {
            System.out.println("Чётное");
        } else {
            System.out.println("Нечётное");
        }
    }

    public static void sale() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите возраст: ");
        int age = scanner.nextInt();

        if (age < 18) {
            System.out.println("25%");
        } else if (age >= 65) {
            System.out.println("30%");
        } else {
            System.out.println("без скидки");
        }
    }

    public static void checkTestResult() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите баллы: ");
        int mark = scanner.nextInt();

        if (mark >= 90) {
            System.out.println("Отлично");
        } else if (mark >= 75) {
            System.out.println("Хорошо");
        } else if (mark >= 60) {
            System.out.println("Удовлетворительно");
        } else {
            System.out.println("Неудовлетворительно");
        }
    }
}


