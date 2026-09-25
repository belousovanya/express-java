package homework_8.streamapi;

import java.util.Arrays;
import java.util.List;

/*
5. Проверка наличия хотя бы одного элемента по условию
Задача: Напишите программу, которая проверяет, есть ли хотя бы один элемент в списке,
который удовлетворяет заданному условию (например, является чётным числом), используя Stream API.
 */
public class MatchingElementChecker {
    public static void main(String[] args) {
        List<Integer> integerList = Arrays.asList(1, 2, 3, 4, 5);

        boolean hasEvenNumber = integerList.stream()
                .anyMatch(n -> n % 2 == 0);

        System.out.println(hasEvenNumber);
    }
}
