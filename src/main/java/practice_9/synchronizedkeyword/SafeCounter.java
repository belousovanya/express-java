package practice_9.synchronizedkeyword;

public class SafeCounter {
    // методы по увеличению и уменьшению значений
    // задача реализовать решение в многопоточной среде

    private int count = 0;

    public synchronized void increment() {
        this.count++;
    }

    public synchronized void decrement() {
        this.count--;
    }

    public int getCount() {
        return this.count;
    }
}
