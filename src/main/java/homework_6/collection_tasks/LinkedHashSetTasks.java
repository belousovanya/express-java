package homework_6.collection_tasks;

import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetTasks {
    public static void main(String[] args) {
        task1();
        task2();
    }

    /*
    Задача 1:
    Создайте LinkedHashSet и добавьте в него 5 строк. Проверьте порядок элементов при выводе.
    */
    public static void task1() {
        Set<String> languages = new LinkedHashSet<>();

        languages.add("Русский");
        languages.add("Английский");
        languages.add("Японский");
        languages.add("Китайский");
        languages.add("Испанский");

        System.out.println("Список языков:");
        languages.forEach(System.out::println);
    }

    /*
    Задача 2:
    Напишите метод, который добавляет элемент в LinkedHashSet, но не добавляет дубликаты.
    */

    public static void task2() {
        Set<String> languages = new LinkedHashSet<>();

        addUniqueElement(languages, "Русский");
        addUniqueElement(languages, "Английский");
        addUniqueElement(languages, "Японский");
        addUniqueElement(languages, "Китайский");
        addUniqueElement(languages, "Испанский");
        addUniqueElement(languages, "Русский");
    }


    public static void addUniqueElement(Set<String> set, String element) {
        if (!set.contains(element)) {
            set.add(element);
            System.out.println(element + " язык добавлен");
        } else {
            System.out.println(element + " язык уже существует");
        }
    }

}
