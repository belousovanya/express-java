package homework_8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
2. Фильтрация чисел, кратных 5
Задача: Напишите программу, которая принимает список чисел и отбирает только те,
которые делятся на 5 без остатка, используя Stream API.
 */
public class FilterNumber {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(5, 7, 10, 12, 15);

        List<Integer> filteredInt = integerList.stream()
                .filter(n -> n % 5 == 0)
                .collect(Collectors.toList());

        System.out.println(filteredInt);
    }
}
