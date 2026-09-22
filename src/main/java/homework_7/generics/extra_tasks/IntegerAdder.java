package homework_7.generics.extra_tasks;

import java.util.List;

/*
Ограничение снизу
Задача: Реализуйте метод, который принимает List<T super Integer> и добавляет в него несколько чисел.
 */
public class IntegerAdder {
    public static void addNumbers(List<? super Integer> list) {
        list.add(1);
        list.add(2);
        list.add(3);
    }
}
