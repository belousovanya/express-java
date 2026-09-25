package homework_8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
3. Преобразование строк в их длины
Задача: Напишите программу, которая принимает список строк и заменяет каждую строку на её длину, используя Stream API.
 */
public class StringLengthConverter {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Java", "Python", "JavaScript", "Golang");

        List<Integer> stringLengths = stringList.stream()
                .map(s -> s.length())
                .collect(Collectors.toList());

        System.out.println(stringLengths);
    }
}
