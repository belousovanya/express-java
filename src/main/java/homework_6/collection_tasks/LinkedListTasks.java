package homework_6.collection_tasks;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicInteger;

public class LinkedListTasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
    }

    /*
    Задача 1:
    Создайте LinkedList и добавьте в него 5 строк. Выведите все элементы списка.
     */
    public static void task1() {
        List<String> strings = new LinkedList<>();

        strings.add("Java");
        strings.add("JavaScript");
        strings.add("Golang");
        strings.add("C++");
        strings.add("Python");

        System.out.println("Список ЯП: ");
        strings.forEach(System.out::println);
    }

    /*
    Задача 2:
    Реализуйте очередь задач с LinkedList. Добавьте 3 задачи и обработайте их в порядке поступления.
     */
    public static void task2() {
        Queue<String> tasks = new LinkedList<>();

        tasks.offer("Помыть посуду");
        tasks.offer("Постирать одежду");
        tasks.offer("Помыть обувь");

        System.out.println("Список задач: ");
        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }

    }

    /*
    Задача 3:
    Создайте LinkedList, содержащий несколько строк. Напишите программу, которая печатает первый и последний элементы списка.
     */
    public static void task3() {
        List<String> strings = new LinkedList<>();

        strings.add("Java");
        strings.add("JavaScript");
        strings.add("Golang");
        strings.add("C++");
        strings.add("Python");

        System.out.println("Первый элемент списка - " + strings.getFirst());
        System.out.println("Последний элемент списка - " + strings.getLast());
    }

    /*
    Задача 4:
    Создайте LinkedList из целых чисел. Напишите программу, которая вычисляет сумму элементов списка.
     */
    public static void task4() {
        List<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);
        numbers.add(40);

        AtomicInteger sum = new AtomicInteger();

        numbers.forEach(number -> {
            sum.set(sum.get() + number);
        });

        System.out.println("Сумма элементов списка = " + sum.get());
    }

    /*
    Задача 5:
    Используйте ListIterator для прохода по LinkedList в обоих направлениях.
     */

    public static void task5() {
        List<String> list = new LinkedList<>();

        list.add("Java");
        list.add("Golang");
        list.add("C++");

        ListIterator<String> listIterator = list.listIterator();

        System.out.println("Вперед:");
        while (listIterator.hasNext()) {
            System.out.println(listIterator.next());
        }

        System.out.println("Назад:");
        while (listIterator.hasPrevious()) {
            System.out.println(listIterator.previous());
        }
    }
}
