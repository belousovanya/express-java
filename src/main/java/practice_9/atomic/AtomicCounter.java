package practice_9.atomic;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicCounter {
    // считает кол-во операций по всем потокам
    private static final AtomicInteger count = new AtomicInteger(0);

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(() ->{
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
        });

        Thread thread2 = new Thread(() ->{
            for (int i = 0; i < 1000; i++) {
                count.incrementAndGet();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Кол-во операций: " + count);
    }
}
