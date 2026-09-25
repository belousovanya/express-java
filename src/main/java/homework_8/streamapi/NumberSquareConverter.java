package homework_8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
4. Создание списка квадратов чисел
Задача: Напишите программу, которая принимает список чисел и преобразует его в новый список,
где каждое число заменено на его квадрат, используя Stream API.
 */
public class NumberSquareConverter {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        List<Integer> squaredNumber = integerList.stream()
                .map(n -> n * n)
                .collect(Collectors.toList());

        System.out.println(squaredNumber);
    }
}
