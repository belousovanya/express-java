package homework_6.collection_tasks;

import java.util.Map;
import java.util.TreeMap;

public class TreeMapTasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    /*
    Задача 1:
    Создайте TreeMap и добавьте 5 ключей (имена) и значений (баллы). Выведите отсортированные данные.
     */
    public static void task1() {
        Map<String, Integer> scores = new TreeMap<>();

        scores.put("Анна", 100);
        scores.put("Саша", 100);
        scores.put("Коля", 60);
        scores.put("Вася", 95);
        scores.put("Петя", 70);

        scores.forEach((name, score) -> {
            System.out.println(name + " - " + score + " баллов");
        });
    }

    /*
    Задача 2:
    Найдите минимальный и максимальный ключ в TreeMap.
     */
    public static void task2() {
        TreeMap<Integer, String> scores = new TreeMap<>();

        scores.put(60, "Коля");
        scores.put(95, "Вася");
        scores.put(70, "Петя");

        System.out.println("Минимальный ключ: " + scores.firstKey());
        System.out.println("Максимальный ключ: " + scores.lastKey());
    }

    /*
    Задача 3:
    Реализуйте TreeMap, который хранит сотрудников и их ID, с возможностью поиска ближайшего большего ID.
     */
    public static void task3() {
        TreeMap<Integer, String> employees = new TreeMap<>();

        employees.put(100, "Анна");
        employees.put(101, "Алиса");
        employees.put(102, "Мария");
        employees.put(103, "Иван");
        employees.put(104, "Алексей");

        int id = 103;

        Integer nextId = employees.higherKey(id);

        if (nextId != null) {
            System.out.println("Ближайший больший ID: " + nextId);
        } else {
            System.out.println("Ближайшего болшего ID не существует");
        }
    }
}
