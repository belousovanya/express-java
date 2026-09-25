package homework_8.streamapi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*
5. Удаление дубликатов из списка
Задача: Напишите программу, которая принимает список элементов и удаляет из него все дубликаты, используя Stream API.
 */
public class DuplicateRemover {
    public static void main(String[] args) {
        List<String> stringList = Arrays.asList("Java", "Python", "JavaScript", "Golang", "JavaScript", "Golang");

        List<String> uniqueStrings = stringList.stream()
                .distinct()
                .collect(Collectors.toList());

        System.out.println(uniqueStrings);
    }
}
