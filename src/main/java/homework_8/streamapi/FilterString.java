package homework_8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
1. Фильтрация строк по длине больше 5
Задача: Напишите программу, которая принимает список строк и удаляет из него все строки длиной 5 символов и менее,
используя Stream API.
 */
public class FilterString {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Java", "Python", "JavaScript", "Golang");

        List<String> filteredStrings = stringList.stream()
                .filter(text -> text.length() > 5)
                .collect(Collectors.toList());

        System.out.println(filteredStrings);
    }
}
