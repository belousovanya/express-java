package homework_7.generics.extra_tasks;

public class MyContainer<T> implements Container<T> {

    private T item;

    @Override
    public void add(T item) {
        this.item = item;
    }

    @Override
    public T get() {
        return this.item;
    }
}
