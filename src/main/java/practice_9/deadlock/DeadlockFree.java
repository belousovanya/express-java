package practice_9.deadlock;

import java.io.File;

public class DeadlockFree {
    private static final File firstFile = new File(DeadlockFree.class.getClassLoader().getResource("1.txt").getFile());
    private static final File secondFile = new File(DeadlockFree.class.getClassLoader().getResource("2.txt").getFile());

    public static void main(String[] args) {
        Thread thread1 = new Thread(() -> {
            synchronized (firstFile) {
                System.out.println("Поток 1 захватил файл 1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (secondFile) {
                    System.out.println("Поток 1 захватил файл 2");
                }
            }
        });

        Thread thread2 = new Thread(() -> {
            synchronized (firstFile) {
                System.out.println("Поток 2 захватил файл 1");

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

                synchronized (secondFile) {
                    System.out.println("Поток 2 захватил файл 2");
                }
            }
        });

        thread1.start();
        thread2.start();
    }
}
