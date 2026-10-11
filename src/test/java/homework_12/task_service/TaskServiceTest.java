package homework_12.task_service;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class TaskServiceTest {
    /**
     * Добавление: задача сохраняется.
     * Повторный ID: выбрасывается InvalidTaskException, новая задача не добавляется.
     * Удаление по ID: нужная задача исчезает, остальные остаются.
     * Удаление отсутствующего ID: выбрасывается InvalidTaskException.
     * Фильтрация по статусу: возвращаются только задачи нужного статуса.
     * Фильтрация по приоритету: возвращаются только задачи нужного приоритета.
     * Нет совпадений: фильтры возвращают пустой список.
     * Сортировка по дате: задачи расположены от ранней даты к поздней.
     * Одновременное добавление одного ID: сохраняется только одна задача.
     */

    private TaskService<Integer> taskService;

    @BeforeEach
    public void setupTest() {
        taskService = new TaskService<>();
    }

    @Test
    public void userCanAddTask() {
        Task<Integer> task = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026, 10, 11));

        taskService.addTask(task);

        List<Task<Integer>> expectedTasks = List.of(task);
        List<Task<Integer>> actualTasks = taskService.getAllTasks();

        assertEquals(expectedTasks, actualTasks);
    }

    @Test
    public void userCanNotAddTaskIfIdExists() {
        Task<Integer> task1 = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026, 10, 11));
        Task<Integer> task2 = new Task<>(1, Status.IN_PROGRESS, Priority.LOW, LocalDate.of(2026, 10, 11));

        taskService.addTask(task1);

        assertThrows(InvalidTaskException.class,
                () -> taskService.addTask(task2));

        List<Task<Integer>> expectedTasks = List.of(task1);
        List<Task<Integer>> actualTasks = taskService.getAllTasks();

        assertEquals(expectedTasks, actualTasks);
    }

    @Test
    public void userCanNotDeleteTaskIfIdDoesNotExist() {
        Task<Integer> task = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026, 10, 11));

        taskService.addTask(task);

        assertThrows(InvalidTaskException.class,
                () -> taskService.deleteTaskById(3));

        List<Task<Integer>> expectedTasks = List.of(task);
        List<Task<Integer>> actualTasks = taskService.getAllTasks();

        assertEquals(expectedTasks, actualTasks);
    }

    @Test
    public void userCanFilterTaskByStatus() {
        Task<Integer> task1 = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026, 10, 11));
        Task<Integer> task2 = new Task<>(2, Status.IN_PROGRESS, Priority.LOW, LocalDate.of(2026, 10, 11));

        taskService.addTask(task1);
        taskService.addTask(task2);

        List<Task<Integer>> expectedTasks = List.of(task1);
        List<Task<Integer>> actualTasks = taskService.filterTaskByStatus(Status.NEW);

        assertEquals(expectedTasks, actualTasks);
    }

    @Test
    public void userCanFilterTaskByPriority() {
        Task<Integer> task1 = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026, 10, 11));
        Task<Integer> task2 = new Task<>(2, Status.IN_PROGRESS, Priority.LOW, LocalDate.of(2026, 10, 11));

        taskService.addTask(task1);
        taskService.addTask(task2);

        List<Task<Integer>> expectedTasks = List.of(task1);
        List<Task<Integer>> actualTasks = taskService.filterTaskByPriority(Priority.HIGH);

        assertEquals(expectedTasks, actualTasks);
    }

    @Test
    public void userCanFilterTaskByStatusWithNoMatches() {
        Task<Integer> task = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026, 10, 11));

        taskService.addTask(task);

        List<Task<Integer>> expectedTasks = List.of();
        List<Task<Integer>> actualTasks = taskService.filterTaskByStatus(Status.DONE);

        assertEquals(expectedTasks, actualTasks);

    }

    @Test
    public void userCanFilterTaskByPriorityWithNoMatches() {
        Task<Integer> task = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026, 10, 11));

        taskService.addTask(task);

        List<Task<Integer>> expectedTasks = List.of();
        List<Task<Integer>> actualTasks = taskService.filterTaskByPriority(Priority.LOW);

        assertEquals(expectedTasks, actualTasks);
    }

    @Test
    public void userCanSortTasksByDate() {
        Task<Integer> task1 = new Task<>(1, Status.NEW, Priority.HIGH, LocalDate.of(2026, 10, 14));
        Task<Integer> task2 = new Task<>(2, Status.IN_PROGRESS, Priority.LOW, LocalDate.of(2026, 10, 13));
        Task<Integer> task3 = new Task<>(3, Status.DONE, Priority.MEDIUM, LocalDate.of(2026, 10, 12));

        taskService.addTask(task1);
        taskService.addTask(task2);
        taskService.addTask(task3);

        List<Task<Integer>> expectedTasks = List.of(task3, task2, task1);
        List<Task<Integer>> actualTasks = taskService.sortTaskByDate();

        assertEquals(expectedTasks, actualTasks);

    }

    @Test
    public void userCanAddOnlyOneTaskWithSameIdConcurrently()
            throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(4);

        try {
            List<Callable<Boolean>> tasks = new ArrayList<>();

            for (int i = 0; i < 100; i++) {
                tasks.add(() -> {
                    Task<Integer> task = new Task<>(
                            1, Status.NEW, Priority.HIGH, LocalDate.now()
                    );

                    try {
                        taskService.addTask(task);
                        return true;
                    } catch (InvalidTaskException exception) {
                        return false;
                    }
                });
            } // Здесь закрываем цикл: все 100 задач созданы

            List<Future<Boolean>> futureList = executorService.invokeAll(tasks);

            int successfulAdds = 0;

            for (Future<Boolean> result : futureList) {
                if (result.get()) {
                    successfulAdds++;
                }
            }

            int expectedCount = 1;
            int actualCount = taskService.getAllTasks().size();

            assertEquals(expectedCount, successfulAdds);
            assertEquals(expectedCount, actualCount);
        } finally {
            executorService.shutdown();
        }
    }
}
