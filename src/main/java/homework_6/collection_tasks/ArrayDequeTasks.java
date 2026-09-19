package homework_6.collection_tasks;

import java.util.ArrayDeque;
import java.util.Deque;

public class ArrayDequeTasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    /*
    Задача 1:
    Создайте ArrayDeque, добавьте 5 элементов и выведите их.
     */
    public static void task1() {
        Deque<String> languages = new ArrayDeque<>();

        languages.add("Java");
        languages.add("Python");
        languages.add("C++");
        languages.add("TypeScript");
        languages.add("JavaScript");

        languages.forEach(System.out::println);
    }

    /*
    Задача 2:
    Используйте ArrayDeque как стек: добавьте элементы и извлеките их в обратном порядке.
     */
    public static void task2() {
        Deque<String> stack = new ArrayDeque<>();

        stack.push("Первый");
        stack.push("Второй");
        stack.push("Третий");

        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }

    /*
    Задача 3:
    Используйте ArrayDeque как очередь: добавьте элементы в начало и конец, извлеките из обоих концов.
     */
    public static void task3() {
        Deque<String> deque = new ArrayDeque<>();

        deque.offerFirst("Начало");
        deque.offerLast("Конец");
        deque.offerFirst("Новое начало");
        deque.offerLast("Новый конец");

        System.out.println("С начала: " + deque.pollFirst());
        System.out.println("С конца: " + deque.pollLast());

        System.out.println("Осталось: " + deque);
    }
}
