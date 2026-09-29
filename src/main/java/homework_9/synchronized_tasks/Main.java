package homework_9.synchronized_tasks;

/*
4. Задача: использование synchronized
Условие задачи: Напишите класс Counter с методом increment, увеличивающим значение счётчика.
Создайте два потока, каждый из которых вызывает increment() 1000 раз.
Обеспечьте правильную работу с помощью synchronized.
 */
public class Main {
    public static void main(String[] args) throws InterruptedException {
        Counter counter = new Counter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                counter.increment();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter.getCount());
    }
}