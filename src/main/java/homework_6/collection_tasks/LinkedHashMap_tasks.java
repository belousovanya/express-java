package homework_6.collection_tasks;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMap_tasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    /*
    Задача 1:
    Создайте LinkedHashMap и добавьте в него 5 элементов. Выведите их в порядке добавления.
     */
    public static void task1() {
        Map<String, Integer> users = new LinkedHashMap<>();

        users.put("Анна", 25);
        users.put("Мария", 30);
        users.put("Ольга", 40);
        users.put("Алексей", 42);
        users.put("Иван", 27);

        users.forEach((name, age) -> {
            System.out.println(name + " - " + age + " лет");
        });
    }

    /*
    Задача 2:
    Реализуйте телефонную книгу с LinkedHashMap. Добавьте и найдите контакт.
     */
    public static void task2() {
        Map<String, String> phoneBook = new LinkedHashMap<>();

        phoneBook.put("Анна", "+79999999999");
        phoneBook.put("Иван", "+79999999998");
        phoneBook.put("Ольга", "+79999999977");

        String name = "Анна";

        if (phoneBook.containsKey(name)) {
            System.out.println(name + " : " + phoneBook.get(name));
        } else {
            System.out.println("Контакт не найден");
        }
    }

    /*
    Задача 3:
    Создайте LinkedHashMap, который хранит историю просмотров пользователя (максимум 10 элементов).
     */
    public static void task3() {
        LinkedHashMap<String, String> history = new LinkedHashMap<>();

        addToHistory(history, "page1", "Главная");
        addToHistory(history, "page2", "Каталог");
        addToHistory(history, "page3", "Телефоны");
        addToHistory(history, "page4", "Ноутбуки");
        addToHistory(history, "page5", "Одежда");
        addToHistory(history, "page6", "Обувь");
        addToHistory(history, "page7", "Книги");
        addToHistory(history, "page8", "Игры");
        addToHistory(history, "page9", "Авто");
        addToHistory(history, "page10", "Работа");
        addToHistory(history, "page11", "Квартиры");

        for (Map.Entry<String, String> entry : history.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

    }

    public static void addToHistory(LinkedHashMap<String, String> history, String pageId, String pageName) {
        if (history.size() == 10) {
            String firstKey = history.keySet().iterator().next();
            history.remove(firstKey);

        }
        history.put(pageId, pageName);
    }

}
