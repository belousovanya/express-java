package homework_6.collection_tasks;

import java.util.HashMap;
import java.util.Map;

public class HashMapTasks {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
    }

    /*
    Задача 1:
    Создайте HashMap<String, Integer>, добавьте 5 пар (имя – возраст) и выведите все записи.
     */
    public static void task1() {
        Map<String, Integer> users = new HashMap<>();

        users.put("Анна", 31);
        users.put("Мария", 25);
        users.put("Иван", 30);
        users.put("Алексей", 28);
        users.put("Ольга", 27);

        users.forEach((name, age) -> {
            System.out.println("Имя: " + name + ", возраст: " + age);
        });
    }

    /*
    Задача 2:
    Проверьте, есть ли определённое имя в HashMap.
    */
    public static void task2() {
        HashMap<String, Integer> users = new HashMap<>();

        users.put("Анна", 31);
        users.put("Мария", 25);
        users.put("Иван", 30);
        users.put("Алексей", 28);
        users.put("Ольга", 27);

        String name = "Иван";

        if (users.containsKey(name)) {
            System.out.println("Пользователь " + name + " найден");
        } else {
            System.out.println("Такого пользователя нет");
        }
    }

    /*
    Задача 3:
    Реализуйте метод, который печатает из HashMap всех пользователей младше 18 лет.
     */
    public static void task3() {
        HashMap<String, Integer> users = new HashMap<>();

        users.put("Анна", 31);
        users.put("Мария", 25);
        users.put("Иван", 17);
        users.put("Алексей", 16);
        users.put("Ольга", 27);

        printUsersUnder18(users);

    }

    public static void printUsersUnder18(Map<String, Integer> users) {
        users.forEach((name, age) -> {
            if (age < 18) {
                System.out.println(name + " - " + age + " лет");
            }
        });
    }
}
