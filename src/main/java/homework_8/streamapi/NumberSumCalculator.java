package homework_8.streamapi;

import java.util.Arrays;
import java.util.List;

/*
3. Сумма всех элементов списка
Задача: Напишите программу, которая принимает список чисел и вычисляет их сумму, используя Stream API.
 */
public class NumberSumCalculator {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        int sum = integerList.stream()
                .mapToInt(n -> n)
                .sum();

        System.out.println(sum);
    }
}
