package homework_8.lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class MainForLambda {
    public static void main(String[] args) {
        /*
        3. Лямбда-выражение с Predicate
        Задача: Напишите лямбду, которая проверяет, является ли число чётным.
         */
        Predicate<Integer> isEven = a -> a % 2 == 0;

        System.out.println(isEven.test(4));
        System.out.println(isEven.test(5));

        /*
        4. Лямбда-выражение с Function
        Задача: Создайте лямбду, которая принимает строку и возвращает её длину.
         */
        Function<String, Integer> stringLength = text -> text.length();

        System.out.println(stringLength.apply("Hello"));

        /*
        5. Использование Consumer
        Задача: Напишите лямбду, которая принимает строку и печатает её в консоль.
         */
        Consumer<String> printText = text -> System.out.println(text);
        printText.accept("Hello!");
    }
}
