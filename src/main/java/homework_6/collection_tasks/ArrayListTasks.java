package homework_6.collection_tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

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

        System.out.println("Список чисел (второй вариант решения) -" + numbers);
    }

    public static void task1SecondVariant() {
        List<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));

        numbers.add(10);
        System.out.println("Список чисел -" + numbers);
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
        numbers.forEach(number -> {
            if (number % 2 == 0) {
                System.out.println(number);
            }
        });
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

        AtomicReference<String> longestWord = new AtomicReference<>(words.getFirst());

        words.forEach(word -> {
            if (word.length() > longestWord.get().length()) {
                longestWord.set(word);
            }
        });
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

        AtomicInteger sum = new AtomicInteger();

        numbers.forEach(number -> {
            sum.set(sum.get() + number);
        });
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

        AtomicInteger max = new AtomicInteger(numbers.getFirst());

        numbers.forEach(number -> {
            if (number > max.get()) {
                max.set(number);
            }
        });
        System.out.println("Максимальное число из списка = " + max);
    }
}
