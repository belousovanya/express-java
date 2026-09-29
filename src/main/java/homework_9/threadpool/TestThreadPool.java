package homework_9.threadpool;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/*
5. Реализация пула потоков для обработки задач
Условие задачи:
Напишите программу, которая использует ExecutorService для создания пула потоков, в котором несколько потоков обрабатывают задачи.
Каждая задача — это выполнение простого теста с задержкой.
Программа должна создать пул из 4 потоков, каждая задача должна быть выполнена с задержкой в 2 секунды.
После выполнения всех задач, результат должен быть выведен в главном потоке.
*/
public class TestThreadPool {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        int threadCount = 4;

        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);

        Callable<String> task = () -> {
            Thread.sleep(2000);
            return "Задача выполнена";
        };

        List<Future<String>> futureList = new ArrayList<>();

        for (int i = 0; i < threadCount; i++) {
            Future<String> future = executorService.submit(task);
            futureList.add(future);
        }

        for (Future<String> future : futureList) {
            System.out.println(future.get());
        }
        executorService.shutdown();
    }
}