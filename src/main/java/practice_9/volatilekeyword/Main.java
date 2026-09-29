package practice_9.volatilekeyword;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        long start = System.currentTimeMillis();
        StatusChecker statusChecker = new StatusChecker();
        Thread thread1 = new Thread(statusChecker);
        thread1.start();
        Thread.sleep(1000);
        statusChecker.stop();

        Thread thread2 = new Thread(statusChecker::stop);
        thread2.start();

        thread1.join();
        thread2.join();

        long end = System.currentTimeMillis();

        System.out.println("Время остановки статус чекера без volatile: " + (end - start));
    }
}
