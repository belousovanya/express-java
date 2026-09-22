package homework_7.generics.extra_tasks;

import java.util.ArrayList;
import java.util.List;

/*
Ограничение сверху
Задача: Напишите обобщённый метод, который принимает List<T extends Number>
и вычисляет сумму элементов.
 */
public class SumCalculator {
    public static void sum(List<? extends Number> list) {
        double sum = 0;
        for (Number num : list) {
            sum += num.doubleValue();
        }
        System.out.println(sum);
    }
}
