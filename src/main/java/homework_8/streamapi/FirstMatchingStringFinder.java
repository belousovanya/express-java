package homework_8.streamapi;

import java.util.Arrays;
import java.util.List;

/*
4. Поиск первого элемента, начинающегося на "Б"
Задача: Напишите программу, которая принимает список строк и находит первую строку,
начинающуюся на букву "Б", используя Stream API.
 */
public class FirstMatchingStringFinder {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Анна", "Лиза", "Петр", "Борис");

        String firstFindedString = stringList.stream()
                .filter(s -> s.toLowerCase().startsWith("б"))
                .findFirst()
                .get();

        System.out.println(firstFindedString);
    }
}