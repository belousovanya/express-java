package homework_7.generics.extra_tasks;

import java.util.ArrayList;
import java.util.List;

/*
Работа с числами
Задача: Создайте класс NumberBox<T extends Number>,
который хранит только числа и возвращает их сумму.
 */
public class NumberBox<T extends Number> {
    private List<T> numbers = new ArrayList<>();

    public void add(T number) {
        numbers.add(number);
    }

    public double getSum() {
        double sum = 0;

        for (T number : numbers) {
            sum += number.doubleValue();
        }
        return sum;
    }
}
