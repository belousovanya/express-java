package homework_7.generics.extra_tasks;

import java.util.Map;

/*
Коллекция с обобщёнными типами
Задача: Создайте Map<K, V> и реализуйте метод,
который принимает обобщённые ключи и значения, а затем выводит их.
 */
public class MapPrinter<K, V> {
    public static <K, V> void printMap(Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            System.out.println(entry);
        }
    }
}