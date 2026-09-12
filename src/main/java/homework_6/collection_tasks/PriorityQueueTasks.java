package homework_6.collection_tasks;

import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueTasks {
    public static void main(String[] args) {
        task1();
    }

    /*
    Задача 1:
    Создайте PriorityQueue и добавьте 5 чисел. Выведите их в порядке удаления.
     */
    public static void task1() {
        Queue<Integer> numbers = new PriorityQueue<>();

        numbers.offer(1);
        numbers.offer(2);
        numbers.offer(3);
        numbers.offer(4);
        numbers.offer(5);

        while (!numbers.isEmpty()) {
            System.out.println(numbers.poll());
        }
    }
}
