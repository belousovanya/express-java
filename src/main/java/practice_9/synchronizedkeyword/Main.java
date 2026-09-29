package practice_9.synchronizedkeyword;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        SafeCounter safeCounter = new SafeCounter();

        Thread thread1 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                safeCounter.increment();
            }
        });

        Thread thread2 = new Thread(() -> {
            for (int i = 0; i < 1000; i++) {
                safeCounter.decrement();
            }
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Значение count: " + safeCounter.getCount());
    }
}
