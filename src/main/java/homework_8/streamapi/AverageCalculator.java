package homework_8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
3. Поиск среднего значения чисел
Задача: Напишите программу, которая принимает список чисел и находит их среднее значение, используя Stream API.
 */
public class AverageCalculator {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        Double averageNum = integerList.stream()
                .collect(Collectors.averagingInt(n -> n));
        System.out.println(averageNum);

    }
}