package homework_7.generics;

/*
2. Задача на дженерик метод
Условие задачи: Напишите дженерик метод printArray,
который принимает массив элементов любого типа и выводит каждый элемент массива на консоль.
 */
public class ArrayPrinter {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }
}
