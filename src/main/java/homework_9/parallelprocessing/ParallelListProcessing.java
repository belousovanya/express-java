package homework_9.parallelprocessing;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

/*
6. Параллельная обработка данных с использованием потоков
Условие задачи:
Напишите программу, которая создает 3 потока для обработки элементов в списке.
Каждый поток должен обработать 3 элемента из списка и вывести их индекс и значение.
После завершения всех потоков, программа должна вывести общий результат: сколько элементов было обработано и их суммы.
 */
public class ParallelListProcessing {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9);
        int threadCount = 3;
        int elementsPerThread = integerList.size() / threadCount;

        ExecutorService executorService = Executors.newFixedThreadPool(threadCount);

        List<Future<Integer>> futureList = new ArrayList<>();

        for (int i = 0; i < threadCount; i++) {
            int startIndex = i * elementsPerThread;
            int endIndex = startIndex + elementsPerThread;

            Callable<Integer> task = () -> {
                int sum = 0;

                for (int j = startIndex; j < endIndex; j++) {
                    System.out.println("Индекс: " + j + " , значение " + integerList.get(j));
                    sum += integerList.get(j);
                }
                return sum;
            };

            Future<Integer> future = executorService.submit(task);
            futureList.add(future);

        }

        int totalSum = 0;

        for (Future<Integer> future : futureList) {
            totalSum += future.get();
        }

        System.out.println("Общая сумма: " + totalSum);

        executorService.shutdown();

    }
}
