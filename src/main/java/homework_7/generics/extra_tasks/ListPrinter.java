package homework_7.generics.extra_tasks;

import java.util.List;

/*
Обобщённый метод
Задача: Реализуйте метод printList(List<T>),
который принимает список любого типа и выводит его элементы.
 */
public class ListPrinter {
    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }
}
