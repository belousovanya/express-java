package homework_6.collection_tasks;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class HashSetTasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    /*
    Задача 1:
    Создайте HashSet из 5 чисел и выведите его содержимое.
     */
    public static void task1() {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);

        numbers.forEach(System.out::println);
    }

    /*
    Задача 2:
    Добавьте в HashSet 10 чисел. Проверьте, содержит ли он заданное число.
     */
    public static void task2() {
        Set<Integer> numbers = new HashSet<>();

        numbers.add(5);
        numbers.add(6);
        numbers.add(7);
        numbers.add(8);
        numbers.add(9);
        numbers.add(10);
        numbers.add(11);
        numbers.add(12);
        numbers.add(13);
        numbers.add(14);

        int numberToFind = 7;

        if (numbers.contains(numberToFind)) {
            System.out.println("Число " + numberToFind + " есть в HashSet");
        } else {
            System.out.println("Числа " + numberToFind + " нет в HashSet");
        }
    }

    /*Задача 3:
    Реализуйте метод, который принимает List<String> и возвращает Set<String> без дубликатов.
     */
    public static void task3() {
        List<String> words = new ArrayList<>();

        words.add("Java");
        words.add("Python");
        words.add("Golang");
        words.add("C++");
        words.add("TypeScript");
        words.add("Java");

        System.out.println("Добавленные слова: " + words);
        System.out.println("Уникальные слова: " + returntUniqueWords(words));
    }

    public static Set<String> returntUniqueWords(List<String> words) {
        return new HashSet<>(words);
    }

    /*
    Задача 4:
    Создайте HashSet, содержащий набор имен. Напишите программу, которая проверяет, содержится ли ваше имя в множестве, и выводит соответствующее сообщение.
     */
    public static void task4() {
        Set<String> names = new HashSet<>();

        names.add("Anna");
        names.add("Petya");
        names.add("David");
        names.add("Eliza");

        String myName = "Anna";

        if (names.contains(myName)) {
            System.out.println("Мое имя - " + myName + " содержится во множестве");
        } else {
            System.out.println("Мое имя - " + myName + " не содержится во множестве");
        }
    }
}
