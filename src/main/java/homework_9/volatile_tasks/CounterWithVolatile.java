package homework_9.volatile_tasks;

/*
3. Задача: использование volatile
Условие задачи: Создайте поток, который бесконечно увеличивает счетчик.
В основном потоке через 2 секунды установите флаг stop = true, чтобы остановить поток.
*/
public class CounterWithVolatile implements Runnable {
    private volatile boolean stop = false;

    @Override
    public void run() {
        int count = 0;
        while (!stop) {
            count++;
        }
        System.out.println(count);
    }

    public void stop() {
        stop = true;
    }

    public static void main(String[] args) throws InterruptedException {
        CounterWithVolatile counterWithVolatile = new CounterWithVolatile();

        Thread thread = new Thread(counterWithVolatile);
        thread.start();

        Thread.sleep(2000);

        counterWithVolatile.stop();
    }
}