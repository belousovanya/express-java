package homework_9.lock;

import java.util.concurrent.atomic.AtomicLong;
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
    private static final AtomicLong NEXT_ID = new AtomicLong();
    private final long id = NEXT_ID.getAndIncrement();

    public BankAccount(int balance) {
        this.balance = balance;
    }

    public int getBalance() {
        return this.balance;
    }

    public void transferTo(BankAccount other, int amount) {
        BankAccount first;
        BankAccount second;

        if (this.id < other.id) {
            first = this;
            second = other;
        } else {
            first = other;
            second = this;
        }

        first.lock.lock();
        second.lock.lock();

        try {
            if (this.balance >= amount) {
                this.balance -= amount;
                other.balance += amount;
            }
        } finally {
            second.lock.unlock();
            first.lock.unlock();
        }
    }
}
