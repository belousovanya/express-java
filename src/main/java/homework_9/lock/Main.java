package homework_9.lock;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        BankAccount bankAccount1 = new BankAccount(1000);
        BankAccount bankAccount2 = new BankAccount(500);

        Thread thread1 = new Thread(() -> {
            bankAccount1.transferTo(bankAccount2, 100);
        });

        Thread thread2 = new Thread(() -> {
            bankAccount2.transferTo(bankAccount1, 200);
        });

        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println("Счёт 1: " + bankAccount1.getBalance());
        System.out.println("Счёт 2: " + bankAccount2.getBalance());
    }
}
