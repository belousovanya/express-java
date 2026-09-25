package homework_8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/*
1. Группировка строк по первой букве
Задача: Напишите программу, которая принимает список строк и группирует их по первой букве, используя Stream API.
 */
public class StringGrouper {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Анна", "Алекс", "Лиза", "Петр", "Борис");

        Map<Character, List<String>> groupedByFistLetter = stringList.stream()
                .collect(Collectors.groupingBy(s -> s.charAt(0)));

        System.out.println(groupedByFistLetter);
    }
}
