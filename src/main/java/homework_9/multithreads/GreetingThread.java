package homework_9.multithreads;

/*
1. Задача: создание одного потока
Условие задачи: Напишите программу, в которой создается отдельный поток,
выводящий сообщение "Привет из потока!" 5 раз с паузой в 1 секунду между сообщениями.
 */
public class GreetingThread implements Runnable {
    @Override
    public void run() {
        int count = 0;
        while (count < 5) {
            System.out.println("Привет из потока!");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                return;
            }
            count++;
        }
    }

    public static void main(String[] args) {
        GreetingThread greetingThread = new GreetingThread();

        Thread thread1 = new Thread(greetingThread);

        thread1.start();
    }
}