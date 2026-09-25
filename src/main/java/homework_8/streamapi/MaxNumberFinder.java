package homework_8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
1. Поиск максимального элемента
Задача: Напишите программу, которая принимает список чисел и находит в нём самое большое число, используя Stream API.
 */
public class MaxNumberFinder {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        Integer maxInt = integerList.stream()
                .max(Comparator.naturalOrder())
                .get();
        System.out.println(maxInt);
    }
}
