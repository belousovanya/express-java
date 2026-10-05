package homework_9.multithreads;

/*
2. Задача: создание двух потоков
Условие задачи: Создайте два потока.
Один поток должен печатать "A", второй — "B", каждый по 5 раз с небольшой задержкой.
 */
public class TwoThreads {
    public static void main(String[] args) {

        Thread thread1 = new Thread(() -> {
            int count = 0;

            while (count < 5) {
                System.out.println("A");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                count++;
            }
        });

        Thread thread2 = new Thread(() -> {
            int count = 0;

            while (count < 5) {
                System.out.println("B");

                try {
                    Thread.sleep(500);
                } catch (InterruptedException e) {
                    Thread.currentThread().interrupt();
                    return;
                }
                count++;
            }
        });

        thread1.start();
        thread2.start();
    }
}
