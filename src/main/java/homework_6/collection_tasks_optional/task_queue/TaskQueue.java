package homework_6.collection_tasks_optional.task_queue;

import java.util.ArrayDeque;
import java.util.Queue;

/*
2. Очередь задач для обработки
Задача:
Хранить задачи в порядке поступления и обрабатывать по очереди.
 */
public class TaskQueue {
    private Queue<String> tasks = new ArrayDeque<>();

    public void addTasks(String task) {
        tasks.offer(task);
    }

    public void processTask() {
        while (!tasks.isEmpty()) {
            System.out.println(tasks.poll());
        }
    }
}
