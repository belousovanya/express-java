package homework_8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
2. Группировка чисел по чётности
Задача: Напишите программу, которая принимает список чисел и группирует их на чётные и нечётные, используя Stream API.
 */
public class NumberGrouperByParity {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        Map<Boolean, List<Integer>> parityNumbers = integerList.stream()
                .collect(Collectors.groupingBy(n -> n % 2 == 0));

        System.out.println(parityNumbers);
    }
}
