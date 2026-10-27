package homeworks.homework_12.task_service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TaskService<T> {
    private final List<Task<T>> taskList = new ArrayList<>();

    public synchronized void addTask(Task<T> task) {
        boolean idExists = taskList.stream()
                .anyMatch(existingTask -> existingTask.getId().equals(task.getId()));

        if (idExists) {
            throw new InvalidTaskException("Задача с таким ID уже существует");
        }

        taskList.add(task);
    }

    public synchronized void deleteTaskById(T id) {
        boolean idExists = taskList.stream()
                .anyMatch(taskId -> taskId.getId().equals(id));

        if (!idExists) {
            throw new InvalidTaskException("Задачи с таким ID не существует");
        }

        taskList.removeIf(task -> task.getId().equals(id));
    }

    public synchronized List<Task<T>> filterTaskByStatus(Status status) {
        return taskList.stream()
                .filter(task -> task.getStatus() == status)
                .collect(Collectors.toList());
    }

    public synchronized List<Task<T>> filterTaskByPriority(Priority priority) {
        return taskList.stream()
                .filter(task -> task.getPriority() == priority)
                .collect(Collectors.toList());
    }


    public synchronized List<Task<T>> sortTaskByDate() {
        return taskList.stream()
                .sorted((task1, task2) ->
                        task1.getDate().compareTo(task2.getDate()))
                .collect(Collectors.toList());
    }

    public synchronized List<Task<T>> getAllTasks() {
        return List.copyOf(taskList);
    }
}