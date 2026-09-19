package homework_6.collection_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListTasks {
    public static void main(String[] args) {
        task1();
        task1SecondVariant();
        task2();
        task3();
        task4();
        task5();
    }

    /* Задача 1:
    Создайте ArrayList из 5 чисел. Добавьте ещё одно число в конец. Выведите весь список.
     */
    public static void task1() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        numbers.add(10);

        System.out.println("Список чисел (первый вариант решения) - " + numbers);
    }

    public static void task1SecondVariant() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        numbers.add(10);
        System.out.println("Список чисел (второй вариант решения) - " + numbers);
    }


    /*Задача 2:
    Напишите программу, которая выводит все чётные числа из ArrayList.
    */
    public static void task2() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(2);
        numbers.add(4);
        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(10);

        System.out.println("Все четные числа:");
        for (Integer number : numbers) {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        }
    }

    /* Задача 3:
    Создайте ArrayList из строк. Найдите в нём самую длинную строку и выведите её.
     */
    public static void task3() {
        List<String> words = new ArrayList<>();

        words.add("Осень");
        words.add("Зима");
        words.add("Лето");
        words.add("Весна");

        String longestWord = words.getFirst();

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        System.out.println("Самое длинное слово - " + longestWord);
    }

    /*Задача 4:
    Создайте ArrayList из целых чисел. Напишите программу, которая вычисляет и выводит сумму всех чисел в списке.
     */

    public static void task4() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int sum = 0;

        for (Integer number : numbers) {
            sum += number;
        }
        System.out.println("Сумма всех чисел = " + sum);
    }

    /*
    Задача 5:
    Создайте ArrayList из целых чисел. Напишите программу, которая находит и выводит максимальное число из списка.
     */

    public static void task5() {
        List<Integer> numbers = new ArrayList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        int max = numbers.getFirst();

        for (Integer number : numbers) {
            if (number > max) {
                max = number;
            }
        }
        System.out.println("Максимальное число из списка = " + max);
    }
}
