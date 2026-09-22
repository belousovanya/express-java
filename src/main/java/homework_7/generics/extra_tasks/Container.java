package homework_7.generics.extra_tasks;

/*
Обобщённый интерфейс
Задача: Создайте интерфейс Container<T>, содержащий методы add(T item) и get().
 */
public interface Container<T> {
    public void add(T item);
    public T get();
}
