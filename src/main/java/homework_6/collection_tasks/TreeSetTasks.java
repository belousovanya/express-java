package homework_6.collection_tasks;

import java.util.Set;
import java.util.TreeSet;

public class TreeSetTasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    /*
    Задача 1:
    Создайте TreeSet из 5 чисел и выведите его. Обратите внимание на порядок.
    */

    public static void task1() {
        Set<Integer> numbers = new TreeSet<>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);

        System.out.println(numbers);
    }

    /*
    Задача 2:
    Напишите метод, который добавляет числа в TreeSet, но не позволяет добавить дубликаты.
    */
    public static void task2() {
        Set<Integer> numbers = new TreeSet<>();

        addUniqueNumber(numbers, 10);
        addUniqueNumber(numbers, 20);
        addUniqueNumber(numbers, 30);
        addUniqueNumber(numbers, 40);
        addUniqueNumber(numbers, 10);

        System.out.println("Итоговые числа: " + numbers);

    }
    public static void addUniqueNumber(Set<Integer> set, Integer number) {
        if (!set.add(number)) {
            System.out.println("Число " + number + " уже существует");
        }
    }

    /*
    Задача 3:
    Найдите ближайшее большее и меньшее число к заданному в TreeSet.
     */

    public static void task3() {
        TreeSet<Integer> numbers = new TreeSet<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);
        numbers.add(50);

        int number = 60;

        Integer higher = numbers.higher(number);
        Integer lower = numbers.lower(number);

        if (higher != null) {
            System.out.println("Ближайшее большее число к " + number + " - " + higher);
        }

        if (lower != null) {
            System.out.println("Ближайшее меньшее число к " + number + " - " + lower);
        }
    }
}
