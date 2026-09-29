package homework_9.lock;

import java.util.concurrent.locks.ReentrantLock;

/*
7. Реализация блокировки с использованием ReentrantLock
Условие задачи:
Напишите программу, которая моделирует работу банковского счета с несколькими потоками.
Каждый поток должен попытаться перевести деньги с одного счета на другой.
Для обеспечения правильной работы программы используйте ReentrantLock для синхронизации работы с двумя счетами.
 */
public class BankAccount {
    private int balance;
    private final ReentrantLock lock = new ReentrantLock();

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void transferTo(BankAccount other, int amount) {
        lock.lock();
        other.lock.lock();

        try {
            if (balance >= amount) {
                balance -= amount;
                other.balance += amount;
            }
        } finally {
            other.lock.unlock();
            lock.unlock();
        }
    }
}
