package homework_6.collection_tasks_optional.task_queue;

public class Main {
    public static void main(String[] args) {
        TaskQueue taskQueue = new TaskQueue();

        taskQueue.addTasks("Задача 1");
        taskQueue.addTasks("Задача 2");
        taskQueue.addTasks("Задача 3");

        taskQueue.processTask();

    }
}
