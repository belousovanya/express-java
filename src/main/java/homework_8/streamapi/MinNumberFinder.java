package homework_8.streamapi;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

/*
2. Поиск минимального элемента
Задача: Напишите программу, которая принимает список чисел и находит в нем наименьшее число, используя Stream API.
 */
public class MinNumberFinder {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        Integer minInt = integerList.stream()
                .min(Comparator.naturalOrder())
                .get();

        System.out.println(minInt);
    }
}
